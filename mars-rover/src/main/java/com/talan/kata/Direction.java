package com.talan.kata;

public interface Direction {

	public Direction turnRight();

	public Direction turnLeft();

	public boolean moveForward();

	public boolean moveBackward();

	public Coordinate getCoordinate();

}
