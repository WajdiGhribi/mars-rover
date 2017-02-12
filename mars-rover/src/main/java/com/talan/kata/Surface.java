package com.talan.kata;

import java.util.List;

import com.talan.kata.impl.Obstacle;

public interface Surface {
	public int getSize();

	public boolean isCollision(int x, int y);

	public void setObstacles(List<Obstacle> obstacles);
} 
