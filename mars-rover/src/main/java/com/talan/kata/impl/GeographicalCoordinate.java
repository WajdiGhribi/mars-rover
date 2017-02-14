/*
 * 
 */
package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Surface;

/**
* Geographical Coordinate Object.
*  
* @author GHRIBI Wajdi
* @version 1.0
*/
public class GeographicalCoordinate implements Coordinate {

	/** The x. */
	private int x;

	/** The y. */
	private int y;

	/** The surface. */
	private Surface surface;

	/** The obstacle location. */
	private String obstacleLocation;

	/**
	 * Instantiates a new geographical coordinate.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param surface
	 *            the surface
	 */
	public GeographicalCoordinate(int x, int y, Surface surface) {
		this.x = x;
		this.y = y;
		this.surface = surface;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getX() {
		return x;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getY() {
		return y;
	}

	/**
	 * Sets the x.
	 *
	 * @param destination
	 *            the new x
	 */
	public void setX(int destination) {
		if (!surface.isCollision(destination, y))
			this.x = destination;
	}

	/**
	 * Sets the y.
	 *
	 * @param destination
	 *            the new y
	 */
	public void setY(int destination) {
		if (!surface.isCollision(x, destination))
			this.y = destination;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveForwardX() {
		int destination = 0;
		if (x < surface.getSize())
			destination = x + 1;
		setX(destination);
		return isClearToGo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveBackwardX() {
		int destination = surface.getSize();
		if (x > 0)
			destination = x - 1;
		setX(destination);
		return isClearToGo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveForwardY() {
		int destination = 0;
		if (y < surface.getSize())
			destination = y + 1;
		setY(destination);
		return isClearToGo();

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveBackwardY() {
		int destination = surface.getSize();
		if (y > 0)
			destination = y - 1;
		setY(destination);
		return isClearToGo();
	}

	/**
	 * Checks if is clear to go.
	 *
	 * @return true, if it is clear to go
	 */
	private boolean isClearToGo() {
		return !surface.getEncounteredObstacle().isPresent();
	}
	
	/**
	 * {@inheritDoc}
	 */
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
