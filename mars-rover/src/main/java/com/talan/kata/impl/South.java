package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class South implements Direction {
	private Coordinate coordinate;

	public South(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public Direction turnRight() {
		return new West(coordinate);
	}

	@Override
	public Direction turnLeft() {
		return new East(coordinate);
	}

	@Override
	public boolean moveForward() {
		return coordinate.moveBackwardY();
	}

	@Override
	public boolean moveBackward() {
		return coordinate.moveForwardY();
	}

	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Facing South ");
		sb.append("\n");
		sb.append(coordinate.report());

		return sb.toString();
	}
}
