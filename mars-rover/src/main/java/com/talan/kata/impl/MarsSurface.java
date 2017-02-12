package com.talan.kata.impl;

import java.util.ArrayList;
import java.util.List;

import com.talan.kata.Surface;

public class MarsSurface implements Surface {
	
		private int size;
		private List<Obstacle> obstacles;

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
			return obstacles.stream().filter( obstacle -> obstacle.getX() == x && obstacle.getY() == y )
			.findFirst()
			.isPresent();
		}

		public void setObstacles(List<Obstacle> obstacles) {
			this.obstacles = obstacles;			
		}
		

}
