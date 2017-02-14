package com.talan.kata.impl;

import com.talan.kata.Coordinate;
import com.talan.kata.Direction;

public class West implements Direction {

	/** The coordinate of the rover. */
	private Coordinate coordinate;

	/**
	 * Instantiates a new west.
	 *
	 * @param coordinate
	 *            the coordinate
	 */
	public West(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Direction turnRight() {
		return new North(coordinate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Direction turnLeft() {
		return new South(coordinate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveForward() {
		return coordinate.moveBackwardX();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean moveBackward() {
		return coordinate.moveForwardX();
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
		sb.append("Facing West ");
		sb.append("\n");
		sb.append(coordinate.report());

		return sb.toString();
	}
}
