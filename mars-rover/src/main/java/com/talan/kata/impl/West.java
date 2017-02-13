package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class West implements Direction {

	private Coordinate coordinate;

	public West(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public Direction turnRight() {
		return new North(coordinate);
	}

	@Override
	public Direction turnLeft() {
		return new South(coordinate);
	}

	@Override
	public boolean moveForward() {
		return coordinate.moveBackwardX();
	}

	@Override
	public boolean moveBackward() {
		return coordinate.moveForwardX();
	}

	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Facing West ");
		sb.append("\n");
		sb.append(coordinate.report());

		return sb.toString();
	}
}
