package com.talan.kata;

import java.util.function.Predicate;

public class GeographicalCoordinate implements Coordinate {
	
	private int x;
	private int y;
	
	public GeographicalCoordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moveForwardY() {
		y++;
	}

	public void moveBackwardY() {
		y--;		
	}
	
}
