package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Surface;

public class GeographicalCoordinate implements Coordinate {

	private int x;
	private int y;

	private Surface surface;
	private String obstacleLocation;

	public GeographicalCoordinate(int x, int y, Surface surface) {
		this.x = x;
		this.y = y;
		this.surface = surface;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	public void setX(int destination) {
		if (!surface.isCollision(destination, y))
			this.x = destination;
	}

	public void setY(int destination) {
		if (!surface.isCollision(x, destination))
			this.y = destination;
	}

	public boolean moveForwardX() {
		int destination = 0;
		if (x < surface.getSize())
			destination = x + 1;
		setX(destination);
		return isClearToGo();
	}

	public boolean moveBackwardX() {
		int destination = surface.getSize();
		if (x > 0)
			destination = x - 1;
		setX(destination);
		return isClearToGo();
	}

	public boolean moveForwardY() {
		int destination = 0;
		if (y < surface.getSize())
			destination = y + 1;
		setY(destination);
		return isClearToGo();

	}

	public boolean moveBackwardY() {
		int destination = surface.getSize();
		if (y > 0)
			destination = y - 1;
		setY(destination);
		return isClearToGo();
	}

	private boolean isClearToGo() {
		return !surface.getEncounteredObstacle().isPresent();
	}

	@Override
	public String report() {
		StringBuilder sb = new StringBuilder();
		sb.append("Rover Coordinate [x= ");
		sb.append(x);
		sb.append(" , y= ");
		sb.append(y);
		sb.append(" ]");
		sb.append("\n");
		if (surface.getEncounteredObstacle().isPresent()) {
			sb.append(surface.getEncounteredObstacle().get().toString());
		}
		return sb.toString();
	}

}
