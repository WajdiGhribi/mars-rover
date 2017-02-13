package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class North implements Direction {

	private Coordinate coordinate;

	public North(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public Direction turnRight() {
		return new East(coordinate);
	}

	@Override
	public Direction turnLeft() {
		return new West(coordinate);
	}

	@Override
	public boolean moveForward() {
		return coordinate.moveForwardY();
	}

	@Override
	public boolean moveBackward() {
		return coordinate.moveBackwardY();
	}

	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Facing North ");
		sb.append("\n");
		sb.append(coordinate.report());

		return sb.toString();
	}
}
