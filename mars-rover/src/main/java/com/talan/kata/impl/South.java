package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

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

	public boolean moveForward() {
		return coordinate.moveBackwardY();		
	}

	public boolean moveBackward() {
		return coordinate.moveForwardY();	
	}

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
