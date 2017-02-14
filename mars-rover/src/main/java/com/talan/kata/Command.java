package com.talan.kata;

/**
* Command.
*  .
*  Apply received command.
*  
* @author GHRIBI Wajdi
* @version 1.0
*/
@FunctionalInterface
public interface Command {
	
	/**
	 * Apply the command.
	 *
	 * @return true, if successful
	 */
	public boolean apply();
}
