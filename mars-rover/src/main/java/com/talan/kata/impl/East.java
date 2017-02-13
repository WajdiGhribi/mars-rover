package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class East implements Direction {

	private Coordinate coordinate;

	public East(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	@Override
	public Direction turnRight() {
		return new South(coordinate);
	}
	
	@Override
	public Direction turnLeft() {
		return new North(coordinate);
	}
	
	@Override
	public boolean moveForward() {
		return coordinate.moveForwardX();

	}

	@Override
	public boolean moveBackward() {
		return coordinate.moveBackwardX();
	}

	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Facing East ");
		sb.append("\n");
		sb.append(coordinate.report());

		return sb.toString();
	}
}
