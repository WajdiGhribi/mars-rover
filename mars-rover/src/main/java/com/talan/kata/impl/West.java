package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class West implements Direction {
	
	private Coordinate coordinate;	

	public West(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Direction turnRight() {
		return new North(coordinate);
	}

	public Direction turnLeft() {
		return new South(coordinate);
	}

	public boolean moveForward() {
		return coordinate.moveBackwardX();		
	}

	public boolean moveBackward() {
		return coordinate.moveForwardX();
	}

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
