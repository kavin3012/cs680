package edu.umb.cs680.hw14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw14.Car;


public class CarTest {
	LinkedList<Car> cars = new LinkedList<>();
	Car c1 = new Car("A", "a", 2008, 10, 1234);
	Car c2 = new Car("B", "b", 2018, 8, 2345);
	Car c3 = new Car("C", "c", 2008, 16, 3456);
	Car c4 = new Car("D", "d", 2019, 9, 4567);
	@Test
	public void priceTest() {
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		
		Collections.sort(cars, (car1,car2)->(int)(car1.getPrice()-car2.getPrice()));
		LinkedList<Car> p = new LinkedList<>();
		p.add(c1);
		p.add(c2);
		p.add(c3);
		p.add(c4);
		assertEquals(p,cars);	
	}
	
	@Test
	public void yearTest() {
		cars.add(c1);
		cars.add(c3);
		cars.add(c2);
		cars.add(c4);
		
		Collections.sort(cars, (car1,car2)->car1.getYear()-car2.getYear());
		LinkedList<Car> y = new LinkedList<>();
		y.add(c3);
		y.add(c1);
		y.add(c2);
		y.add(c4);
		assertEquals(y,cars);	
	}
	@Test
	public void mileageTest() {
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		
		Collections.sort(cars, (car1,car2)->car1.getMileage()-car2.getMileage());
		LinkedList<Car> m = new LinkedList<>();
		m.add(c2);
		m.add(c4);
		m.add(c1);
		m.add(c3);
		assertEquals(m,cars);
	}
	
	@Test
	public void paretoTest() {
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		
		Collections.sort(cars, Comparator.comparing((Car c)->c.getYear())
				.thenComparing((Car c)->c.getMileage())
				.thenComparing((Car c)->c.getPrice())
				);
		
		LinkedList<Car> p = new LinkedList<>();
		p.add(c3);
		p.add(c1);
		p.add(c2);
		p.add(c4);
		assertEquals(p,cars);	
	}
}