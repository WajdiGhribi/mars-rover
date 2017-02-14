package com.talan.kata.impl;

public class Obstacle {

	/** The x. */
	private int x;
	
	/** The y. */
	private int y;

	/**
	 * Instantiates a new obstacle.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Obstacle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Reports obstacle coordinate.
	 *
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Obstacle Found [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}
}
