package com.talan.kata;

/**
* Direction.
*  
*  Decide how to move and how to turn.
*  
* @author GHRIBI Wajdi
* @version 1.0
*/
public interface Direction {

	/**
	 * Turn right.
	 *
	 * @return the direction
	 */
	public Direction turnRight();

	/**
	 * Turn left.
	 *
	 * @return the direction
	 */
	public Direction turnLeft();

	/**
	 * Move forward.
	 *
	 * @return true, if successful
	 */
	public boolean moveForward();

	/**
	 * Move backward.
	 *
	 * @return true, if successful
	 */
	public boolean moveBackward();

	/**
	 * Gets the coordinate.
	 *
	 * @return the coordinate
	 */
	public Coordinate getCoordinate();

}
