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

	public void moveForward() {
		coordinate.moveForwardY();		
	}

	public void moveBackward() {
		coordinate.moveBackwardY();		
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
}
