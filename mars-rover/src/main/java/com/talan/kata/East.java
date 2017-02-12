package com.talan.kata;

public class East implements Direction {
	
	private Coordinate coordinate;
	
	public East(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Direction turnRight() {
		return new South(coordinate);
	}

	public Direction turnLeft() {
		return new North(coordinate);
	}

	public void moveForward() {
		coordinate.moveForwardY();
		
	}

	public void moveBackward() {
		coordinate.moveBackwardY();		
	}

}
