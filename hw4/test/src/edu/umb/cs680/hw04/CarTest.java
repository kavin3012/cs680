package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {	
	private String[] CarToStringArray(Car t){
		String[] carCharacteristics = 
			{ 
				t.getMake(), t.getModel(), Integer.toString(t.getYear()) 
			};
		return carCharacteristics;
	}	
	
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] exp = {"Toyota", "RAV4", "2018"};
		Car actual = new Car("Toyota", "RAV4", 2018, 20, 28000);
		assertArrayEquals(exp, CarToStringArray(actual));
	}
}