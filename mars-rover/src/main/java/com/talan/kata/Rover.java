package com.talan.kata;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.talan.kata.impl.CommandFactory;

public class Rover {
	private Direction direction;
	private CommandFactory cf = new CommandFactory();
	Logger logger = Logger.getLogger("Rover");

	public Rover(Direction direction) {
		this.direction = direction;
		configure();
	}

	public void setCf(CommandFactory cf) {
		this.cf = cf;
	}

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

	public Direction getDirection() {
		return direction;
	}

	public void execute(String command) {
		for (char cmd : command.toCharArray()) {
			boolean commandExecutedSuccessfully = cf.executeCommand(Character.toString(cmd));
			if (!commandExecutedSuccessfully)
				break;
		}
		logger.log(Level.INFO, direction.toString());
	}

}
