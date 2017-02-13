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
				else if (cmd == 'b')
					BackWard();
				else if (cmd == 'l')
					turnLeft();
				else if (cmd == 'r')
					turnRight();
		 }

	}

	private void turnRight() {
		direction = direction.turnRight();
		
	}

	private void turnLeft() {
		direction = direction.turnLeft();
		
	}

	private void BackWard() {
		direction.moveBackward();
		
	}

	private boolean Forward() {
		return direction.moveForward();
		
	}
		
}
