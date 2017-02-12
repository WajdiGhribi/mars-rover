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
}
