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
		else if (command.equals("b"))
			BackWard();
		else if (command.equals("l"))
			turnLeft();
	}

	private void turnLeft() {
		direction = direction.turnLeft();
		
	}

	private void BackWard() {
		direction.moveBackward();
		
	}

	private void Forward() {
		direction.moveForward();
		
	}
		
}
