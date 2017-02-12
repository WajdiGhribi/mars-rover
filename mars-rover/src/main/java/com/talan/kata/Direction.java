package com.talan.kata;

import java.util.function.IntPredicate;

public interface Direction {

	public Direction turnRight();

	public Direction turnLeft();

	public void moveForward();

	public void moveBackward();

	public Coordinate getCoordinate();

}
