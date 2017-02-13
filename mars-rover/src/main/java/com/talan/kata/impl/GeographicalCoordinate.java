package com.talan.kata.impl;

import java.util.function.Predicate;

import com.talan.kata.Coordinate;
import com.talan.kata.Surface;

public class GeographicalCoordinate implements Coordinate {
	
	private int x;
	private int y;
	private Surface surface;
	private boolean obstacleDetected;
	
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

	public boolean moveForwardX() {
		int destination = 0;
		if(x < surface.getSize())
			destination = x + 1;
		setX(destination);
		return obstacleDetected;
	}

	public void setX(int destination) {
		if(!surface.isCollision(destination , y))
			this.x = destination;
		else
			obstacleDetected = true;
	}

	public void setY(int destination) {
		if(!surface.isCollision(x , destination))
			this.y = destination;
	}

	public boolean moveBackwardX() {
		int destination = surface.getSize();
		if(x > 0)
			destination = x - 1;
		setX(destination);
		return obstacleDetected;
	}

	public boolean moveForwardY() {
		int destination = 0;
		if(y < surface.getSize())
			destination = y + 1;
		setY(destination);
		return obstacleDetected;
		
	}

	public boolean moveBackwardY() {
		int destination = surface.getSize();
		if(y > 0)
			destination = y - 1;
		setY(destination);
		return obstacleDetected;
	}
	
}
