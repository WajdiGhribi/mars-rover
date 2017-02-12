package com.talan.kata.impl;

import java.util.function.Predicate;

import com.talan.kata.Coordinate;
import com.talan.kata.Surface;

public class GeographicalCoordinate implements Coordinate {
	
	private int x;
	private int y;
	private Surface surface;
	
	public GeographicalCoordinate(int x, int y, Surface surface) {
		this.x = x;
		this.y = y;
		this.surface = surface;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moveForwardX() {
		if(x < surface.getSize())
			x++;
		else
			x = 0;
	}

	public void moveBackwardX() {
		x--;		
	}

	public void moveForwardY() {
		y++;
		
	}

	public void moveBackwardY() {
		y--;		
	}
	
}
