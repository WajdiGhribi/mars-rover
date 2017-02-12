/**
 * 
 */
package com.talan.kata;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
/**
 * @author wajdi
 *
 */
public class DirectionTest {
	
	private Coordinate coordinate;
	
	@Before
	public void beforeDirectionTest(){
		coordinate = new GeographicalCoordinate(0 , 0);
	}
	
	@Test
	public void directionShouldBeEastWhenNorthAndTurnRight(){
		Direction direction = new North(coordinate);
		Direction newDirection = direction.turnRight();
		assertThat(newDirection).isInstanceOf(East.class);		
	}
	
	@Test
	public void directionShouldBeSouthWhenEastAndTurnRight(){
		Direction direction = new East(coordinate);
		Direction newDirection = direction.turnRight();
		assertThat(newDirection).isInstanceOf(South.class);		
	}
	
	@Test
	public void directionShouldBeWestWhenSouthAndTurnRight(){
		Direction direction = new South(coordinate);
		Direction newDirection = direction.turnRight();
		assertThat(newDirection).isInstanceOf(West.class);		
	}
	
	@Test
	public void directionShouldBeNorthWhenWestAndTurnRight(){
		Direction direction = new West(coordinate);
		Direction newDirection = direction.turnRight();
		assertThat(newDirection).isInstanceOf(North.class);		
	}
	
	@Test
	public void directionShouldBeWestWhenNorthAndTurnLeft(){
		Direction direction = new North(coordinate);
		Direction newDirection = direction.turnLeft();
		assertThat(newDirection).isInstanceOf(West.class);		
	}
}
