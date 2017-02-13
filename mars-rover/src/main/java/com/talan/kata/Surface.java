package com.talan.kata;

import java.util.List;
import java.util.Optional;

import com.talan.kata.impl.Obstacle;

public interface Surface {
	public int getSize();

	public boolean isCollision(int x, int y);

	public void setObstacles(List<Obstacle> obstacles);

	Optional<Obstacle> getEncounteredObstacle();
}
