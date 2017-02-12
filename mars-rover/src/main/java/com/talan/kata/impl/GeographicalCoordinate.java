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
		if(x > 0)
			x--;
		else
			x = surface.getSize();
	}

	public void moveForwardY() {
		if(y < surface.getSize())
			y++;
		else
			y = 0;
		
	}

	public void moveBackwardY() {
		y--;		
	}
	
}
