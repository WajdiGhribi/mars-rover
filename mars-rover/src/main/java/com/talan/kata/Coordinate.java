package com.talan.kata;

/**
* Coordinate.
*  
*  Move in X or Y axis if possible(no obstacles).
*  
* @author GHRIBI Wajdi
* @version 1.0
*/
public interface Coordinate {

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX();

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY();

	/**
	 * Move forward X.
	 *
	 * @return true, if successful
	 */
	public boolean moveForwardX();

	/**
	 * Move backward X.
	 *
	 * @return true, if successful
	 */
	public boolean moveBackwardX();

	/**
	 * Move forward Y.
	 *
	 * @return true, if successful
	 */
	public boolean moveForwardY();

	/**
	 * Move backward Y.
	 *
	 * @return true, if successful
	 */
	public boolean moveBackwardY();

	/**
	 * Report.
	 *
	 * @return the coordinate of the rover
	 */
	public String report();

}
