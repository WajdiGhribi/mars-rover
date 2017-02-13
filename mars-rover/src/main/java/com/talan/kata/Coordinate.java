package com.talan.kata;

import java.util.function.Predicate;

public interface Coordinate {

	public int getX();

	public int getY();

	public boolean moveForwardX();

	public boolean moveBackwardX();

	public boolean moveForwardY();
	
	public boolean moveBackwardY();

}
