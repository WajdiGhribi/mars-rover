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

	public void moveForward() {
		coordinate.moveBackwardY();		
	}

	public void moveBackward() {
		coordinate.moveForwardY();	
	}

}
