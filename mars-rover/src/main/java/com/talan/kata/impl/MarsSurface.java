package com.talan.kata.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.talan.kata.Surface;

public class MarsSurface implements Surface {

	/** The size of surface. */
	private int size;
	
	/** The list of obstacles. */
	private List<Obstacle> obstacles = new ArrayList();
	
	/** The encountered obstacle. */
	private Optional<Obstacle> encounteredObstacle = Optional.empty();

	/**
	 * Instantiates a new mars surface with no obstacles.
	 *
	 * @param size
	 *            the size
	 */
	public MarsSurface(int size) {
		this.size = size;
	}

	/**
	 * Instantiates a new mars surface with obstacles.
	 *
	 * @param size
	 *            the size
	 * @param obstacles
	 *            the obstacles
	 */
	public MarsSurface(int size, List<Obstacle> obstacles) {
		this.size = size;
		this.obstacles = obstacles;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<Obstacle> getEncounteredObstacle() {
		return encounteredObstacle;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setObstacles(List<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isCollision(int x, int y) {
		encounteredObstacle = obstacles.stream().filter(obstacle -> obstacle.getX() == x && obstacle.getY() == y)
				.findFirst();
		return encounteredObstacle.isPresent();
	}
}
