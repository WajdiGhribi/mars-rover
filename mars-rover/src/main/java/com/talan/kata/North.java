package com.talan.kata;

public class North implements Direction {
	
	private Coordinate coordinate;

	public North(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Direction turnRight() {
		return new East(coordinate);
	}

	public Direction turnLeft() {
		return new West(coordinate);
	}
	
}
