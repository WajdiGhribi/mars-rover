package com.talan.kata;

public class South implements Direction {
	private Coordinate coordinate;
	
	public South(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Direction turnRight() {
		return new West(coordinate);
	}

	public Direction turnLeft() {
		return new East(coordinate);
	}

	public void moveForward() {
		// TODO Auto-generated method stub
		
	}

	public void moveBackward() {
		// TODO Auto-generated method stub
		
	}

}
