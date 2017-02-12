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
		if (command.equals("f"))
			Forward();
	}

	private void Forward() {
		direction.moveForward();
		
	}
		
}
