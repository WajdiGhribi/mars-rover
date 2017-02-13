package com.talan.kata;

public class Rover {
	private Direction direction;

	public Rover(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

	public void execute(String command) {
		 for (char cmd : command.toCharArray()) {
				if (cmd == 'f'){
					if(!Forward())
						break;
				}
				else if (cmd == 'b'){
					if(!BackWard())
						break;
				}
				else if (cmd == 'l')
					turnLeft();
				else if (cmd == 'r')
					turnRight();
		 }
		 System.out.println(direction.toString());

	}

	private void turnRight() {
		direction = direction.turnRight();
		
	}

	private void turnLeft() {
		direction = direction.turnLeft();
		
	}

	private boolean BackWard() {
		return direction.moveBackward();
		
	}

	private boolean Forward() {
		return direction.moveForward();
		
	}
			
}
