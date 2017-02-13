package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

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

	public boolean moveForward() {
		return coordinate.moveForwardY();		
	}

	public boolean moveBackward() {
		return coordinate.moveBackwardY();		
	}
	
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
