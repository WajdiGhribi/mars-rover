package com.talan.kata;

public class West implements Direction {
	
	private Coordinate coordinate;	

	public West(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Direction turnRight() {
		return new North(coordinate);
	}

	public Direction turnLeft() {
		return new South(coordinate);
	}

	public void moveForward() {
		coordinate.moveBackwardX();		
	}

	public void moveBackward() {
		coordinate.moveForwardX();
	}

}
