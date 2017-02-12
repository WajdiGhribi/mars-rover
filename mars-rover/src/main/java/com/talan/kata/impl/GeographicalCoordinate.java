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
		int destination = 0;
		if(x < surface.getSize())
			destination = x + 1;
		setX(destination);
	}

	public void setX(int destination) {
		if(!surface.isCollision(destination , y))
			this.x = destination;
	}

	public void setY(int destination) {
		if(!surface.isCollision(x , destination))
			this.y = destination;
	}

	public void moveBackwardX() {
		if(x > 0)
			x--;
		else
			x = surface.getSize();
	}

	public void moveForwardY() {
		int destination = 0;
		if(y < surface.getSize())
			destination = y + 1;
		setY(destination);
		
	}

	public void moveBackwardY() {
		if(y > 0)
			y--;
		else
			y = surface.getSize();
	}
	
}
