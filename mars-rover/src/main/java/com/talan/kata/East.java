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
		// TODO Auto-generated method stub
		return null;
	}

}
