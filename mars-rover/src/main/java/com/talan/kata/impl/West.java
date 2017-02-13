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

	public void moveBackward() {
		coordinate.moveForwardX();
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}
}
