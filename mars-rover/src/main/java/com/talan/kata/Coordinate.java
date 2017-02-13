package com.talan.kata;


public interface Coordinate {

	public int getX();

	public int getY();

	public boolean moveForwardX();

	public boolean moveBackwardX();

	public boolean moveForwardY();

	public boolean moveBackwardY();

	public String report();

}
