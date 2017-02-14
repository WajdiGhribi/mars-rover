package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class South implements Direction {

	/** The coordinate of the rover. */
	private Coordinate coordinate;

	/**
	 * Instantiates a new south.
	 *
	 * @param coordinate
	 *            the coordinate
	 */
	public South(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Direction turnRight() {
		return new West(coordinate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Direction turnLeft() {
		return new East(coordinate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveForward() {
		return coordinate.moveBackwardY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveBackward() {
		return coordinate.moveForwardY();
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
		sb.append("Facing South ");
		sb.append("\n");
		sb.append(coordinate.report());

		return sb.toString();
	}
}
