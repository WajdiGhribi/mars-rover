package com.talan.kata;

import org.junit.Before;
import org.junit.Test;

import com.talan.kata.impl.GeographicalCoordinate;
import com.talan.kata.impl.MarsSurface;
import com.talan.kata.impl.Obstacle;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CoordinateTest {
	
	private Coordinate coordinate;
	private Surface surface;
	private List<Obstacle> obstacles = new ArrayList();
	
	@Before
	public void beforeCoordinateTest(){		
		surface = new MarsSurface(3);
		coordinate = new GeographicalCoordinate(0, 0, surface);
	}
	
	@Test
	public void coordinateShoudBeZeroInXAxisWhenInEdgeAndMoveForward(){
		for (int i = 1; i <= 4; i++) {
			coordinate.moveForwardX();
		}
		assertThat(coordinate.getX()).isEqualTo(0);
	}
	
	@Test
	public void coordinateShoudBeZeroInYAxisWhenInEdgeAndMoveForward(){
		for (int i = 1; i <= 4; i++) {
			coordinate.moveForwardY();
		}
		assertThat(coordinate.getY()).isEqualTo(0);
	}  
	
	@Test
	public void coordinateShoudBeEdgeInXAxisWhenInZeroAndMoveBackward(){

		coordinate.moveBackwardX();
		assertThat(coordinate.getX()).isEqualTo(surface.getSize());
	}
	
	@Test
	public void coordinateShoudBeEdgeInYAxisWhenInZeroAndMoveBackward(){

		coordinate.moveBackwardY();
		assertThat(coordinate.getY()).isEqualTo(surface.getSize());
	}
	
	@Test
	public void coordinateShouldNotMoveWhenFacingObstacleInXAxis(){
		obstacles.add(new Obstacle(1, 0));
		surface.setObstacles(obstacles);
		coordinate.moveForwardX();
		assertThat(coordinate.getX()).isEqualTo(0);
		assertThat(coordinate.getY()).isEqualTo(0);
	}
}
