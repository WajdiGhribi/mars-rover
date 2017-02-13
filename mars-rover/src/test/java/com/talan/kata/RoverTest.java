package com.talan.kata;

import org.junit.Before;
import org.junit.Test;

import com.talan.kata.impl.East;
import com.talan.kata.impl.GeographicalCoordinate;
import com.talan.kata.impl.MarsSurface;
import com.talan.kata.impl.North;
import com.talan.kata.impl.Obstacle;
import com.talan.kata.impl.South;
import com.talan.kata.impl.West;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class RoverTest {

	private Surface surface;
	private Coordinate coordinate;
	private Direction initialDirection;
	private List<Obstacle> obstacles = new ArrayList();

	@Before
	public void BeforeRoverTest() {
		surface = new MarsSurface(3);
		coordinate = new GeographicalCoordinate(0, 0, surface);
		initialDirection = new North(coordinate);
	}

	@Test
	public void roverShouldNotMoveAndKeepDirectionWhenReceiveEmptyCommand() {
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, 0, surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByFieldRecursively(expectedCoordinate);
	}

	@Test
	public void roverShouldMoveForwardByOneStepWhenReceiveFAndDirectionNorth() {
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, 1, surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("f");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByFieldRecursively(expectedCoordinate);
	}

	@Test
	public void roverShouldMoveBackwardByOneStepWhenReceiveBAndDirectionNorth() {
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, surface.getSize(), surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("b");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByFieldRecursively(expectedCoordinate);
	}

	@Test
	public void roverShouldNotMoveAndDirectionWestWhenReceiveLAndDirectionNorth() {
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, 0, surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("l");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByFieldRecursively(expectedCoordinate);
		assertThat(rover.getDirection()).isInstanceOf(West.class);
	}

	@Test
	public void roverShouldNotMoveAndDirectionEastWhenReceiveRAndDirectionNorth() {
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, 0, surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("r");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByFieldRecursively(expectedCoordinate);
		assertThat(rover.getDirection()).isInstanceOf(East.class);
	}

	@Test
	public void roverShouldNotMoveAndMaintainDirectionAndCoordinateWhenDetectObstacle() {
		obstacles.add(new Obstacle(0, 1));
		surface.setObstacles(obstacles);
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, 0, surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("ffrf");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByField(expectedCoordinate);
		assertThat(rover.getDirection()).isInstanceOf(North.class);
	}

	@Test
	public void roverShouldNotMoveAndMaintainDirectionAndCoordinateWhenMoveBackwardAndDetectObstacle() {
		obstacles.add(new Obstacle(0, 1));
		surface.setObstacles(obstacles);
		Coordinate expectedCoordinate = new GeographicalCoordinate(0, 0, surface);
		Rover rover = new Rover(initialDirection);
		rover.execute("llb");
		Coordinate actualCoordinate = rover.getDirection().getCoordinate();
		assertThat(actualCoordinate).isEqualToComparingFieldByField(expectedCoordinate);
		assertThat(rover.getDirection()).isInstanceOf(South.class);
	}
}
