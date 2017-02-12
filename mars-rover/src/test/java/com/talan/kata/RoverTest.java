package com.talan.kata;

import org.junit.Before;
import org.junit.Test;

import com.talan.kata.impl.GeographicalCoordinate;
import com.talan.kata.impl.MarsSurface;
import com.talan.kata.impl.North;

import static org.assertj.core.api.Assertions.*;

public class RoverTest {

	private Surface surface;
	private Coordinate coordinate;
	private Direction initialDirection;
	
	@Before
	public void BeforeRoverTest(){
		surface = new MarsSurface(3);
		coordinate = new GeographicalCoordinate(0, 0, surface);
		initialDirection = new North(coordinate);
	}
	
	@Test
	public void roverShouldNotMoveAndKeepDirectionWhenReceiveEmptyCommand(){
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, 0, surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByFieldRecursively(expectedCoordinate);
	}
}
