package com.talan.kata.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.talan.kata.Surface;

public class MarsSurface implements Surface {
	
		private int size;
		private List<Obstacle> obstacles;
		private Optional<Obstacle> encounteredObstacle;
 		public MarsSurface(int size) {
			this.size = size; 
			this.obstacles = new ArrayList();
		}
 		
 		public MarsSurface(int size, List<Obstacle> obstacles) {
			this.size = size; 
			this.obstacles = obstacles;
		}

		public int getSize() {
			return size;
		}
		
		public boolean isCollision(int x, int y) {
			encounteredObstacle = obstacles.stream().filter( obstacle -> obstacle.getX() == x && obstacle.getY() == y )
			.findFirst();
			return encounteredObstacle.isPresent();
		}
		@Override
		public Optional<Obstacle> getEncounteredObstacle() {
			return encounteredObstacle;
		}
		
		public void setObstacles(List<Obstacle> obstacles) {
			this.obstacles = obstacles;			
		}
		

}
