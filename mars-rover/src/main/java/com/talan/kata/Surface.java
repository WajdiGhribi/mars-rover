package com.talan.kata;

import java.util.List;
import java.util.Optional;

import com.talan.kata.impl.Obstacle;

/**
* Surface.
*  
*  Detect collision.
*  
* @author GHRIBI Wajdi
* @version 1.0
*/
public interface Surface {
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize();

	/**
	 * Checks if is collision.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if is collision
	 */
	public boolean isCollision(int x, int y);

	/**
	 * Sets the obstacles.
	 *
	 * @param obstacles the list of obstacles
	 */
	public void setObstacles(List<Obstacle> obstacles);

	/**
	 * Gets the encountered obstacle.
	 *
	 * @return the encountered obstacle
	 */
	Optional<Obstacle> getEncounteredObstacle();
}
