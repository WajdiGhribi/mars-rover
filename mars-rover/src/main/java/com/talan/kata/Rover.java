package com.talan.kata;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.talan.kata.impl.CommandFactory;

/**
* Rover Object.
*  
*  Execute only commands.
*  
* @author GHRIBI Wajdi
* @version 1.0
*/
public class Rover {
	
	/** The direction. */
	private Direction direction;
	
	/** The command factory. */
	private CommandFactory cf = new CommandFactory();
	
	/** The logger. */
	Logger logger = Logger.getLogger("Rover");

	/**
	 * Instantiates a new rover, assume that initial position/coordinate of the
	 * rover is clear, contains no obstacles.
	 *
	 * @param direction
	 *            the direction
	 */
	public Rover(Direction direction) {
		this.direction = direction;
		configure();
	}

	/**
	 * Sets the command factory.
	 *
	 * @param cf
	 *            the new the command factory
	 */
	public void setCf(CommandFactory cf) {
		this.cf = cf;
	}

	/**
	 * Configure the rover after instanciating it.
	 */
	public void configure() {
		cf.addCommand("f", () -> {
			return direction.moveForward();
		});
		cf.addCommand("l", () -> {
			direction = direction.turnLeft();
			return true;
		});
		cf.addCommand("r", () -> {
			direction = direction.turnRight();
			return true;
		});
		cf.addCommand("b", () -> {
			return direction.moveBackward();
		});
	}

	/**
	 * Gets the direction.
	 *
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * Execute.
	 *
	 * @param command
	 *            the command to execute
	 */
	public void execute(String command) {
		for (char cmd : command.toCharArray()) {
			boolean commandExecutedSuccessfully = cf.executeCommand(Character.toString(cmd));
			if (!commandExecutedSuccessfully)
				break;
		}
		logger.log(Level.INFO, direction.toString());
	}

}
