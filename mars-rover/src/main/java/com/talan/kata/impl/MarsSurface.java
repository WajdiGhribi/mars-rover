package com.talan.kata.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.talan.kata.Surface;

public class MarsSurface implements Surface {

	private int size;
	private List<Obstacle> obstacles = new ArrayList();
	private Optional<Obstacle> encounteredObstacle = Optional.empty();

	public MarsSurface(int size) {
		this.size = size;
	}

	public MarsSurface(int size, List<Obstacle> obstacles) {
		this.size = size;
		this.obstacles = obstacles;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Optional<Obstacle> getEncounteredObstacle() {
		return encounteredObstacle;
	}

	@Override
	public void setObstacles(List<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}

	@Override
	public boolean isCollision(int x, int y) {
		encounteredObstacle = obstacles.stream().filter(obstacle -> obstacle.getX() == x && obstacle.getY() == y)
				.findFirst();
		return encounteredObstacle.isPresent();
	}
}
