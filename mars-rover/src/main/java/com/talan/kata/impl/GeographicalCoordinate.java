package com.talan.kata.impl;

import java.util.function.Predicate;

import com.talan.kata.Coordinate;
import com.talan.kata.Surface;

public class GeographicalCoordinate implements Coordinate {
	
	private int x;
	private int y;

	private Surface surface;
	private boolean clearToGo = true;
	private String obstacleLocation;
	
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
		return clearToGo;
	}

	public void setX(int destination) {
		if(!surface.isCollision(destination , y))
			this.x = destination;
		else
			clearToGo = false;
	}

	public void setY(int destination) {
		if(!surface.isCollision(x , destination))
			this.y = destination;
		else
			clearToGo = false;
	}

	public boolean moveBackwardX() {
		int destination = surface.getSize();
		if(x > 0)
			destination = x - 1;
		setX(destination);
		return clearToGo;
	}

	public boolean moveForwardY() {
		int destination = 0;
		if(y < surface.getSize())
			destination = y + 1;
		setY(destination);
		return clearToGo;
		
	}

	public boolean moveBackwardY() {
		int destination = surface.getSize();
		if(y > 0)
			destination = y - 1;
		setY(destination);
		return clearToGo;
	}

	@Override
	public String report() {
		StringBuilder sb = new StringBuilder();
		sb.append("Rover Coordinates [x= ");
		sb.append(x);
		sb.append(" , y= ");
		sb.append(y);
		sb.append(" ]");
		sb.append("\n");
		if(!clearToGo){
			sb.append("Found " );
			sb.append(surface.getEncounteredObstacle().get().toString() );
		}
		return sb.toString();
	}
	
}
