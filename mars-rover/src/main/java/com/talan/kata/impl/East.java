package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class East implements Direction {
	
	private Coordinate coordinate;
	
	public Coordinate getCoordinate() {
		return coordinate;
	}

	public East(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Direction turnRight() {
		return new South(coordinate);
	}

	public Direction turnLeft() {
		return new North(coordinate);
	}

	public boolean moveForward() {
		return coordinate.moveForwardX();
		
	}

	public boolean moveBackward() {
		return coordinate.moveBackwardX();		
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
