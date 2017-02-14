package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class North implements Direction {

	/** The coordinate of the rover. */
	private Coordinate coordinate;

	/**
	 * Instantiates a new north.
	 *
	 * @param coordinate
	 *            the coordinate
	 */
	public North(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Direction turnRight() {
		return new East(coordinate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Direction turnLeft() {
		return new West(coordinate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveForward() {
		return coordinate.moveForwardY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveBackward() {
		return coordinate.moveBackwardY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	/**
	 * describes the direction and the coordinate of the rover.
	 * 
	 * @return direction and coordinate if the roover
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Facing North ");
		sb.append("\n");
		sb.append(coordinate.report());

		return sb.toString();
	}
}
