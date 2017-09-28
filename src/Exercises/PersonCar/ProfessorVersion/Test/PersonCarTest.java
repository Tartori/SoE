/*
 * Copyright (c) 2015 by Eric Dubuis
 * Berner Fachhochschule
 * Biel, Switzerland
 *
 * Project Giant Car Simulator
 */
package Exercises.PersonCar.ProfessorVersion.Test;


import java.util.Set;

import Exercises.PersonCar.ProfessorVersion.Car;
import Exercises.PersonCar.ProfessorVersion.Person;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Eric Dubuis
 */
public class PersonCarTest {

	/**
	 * If car is told who is owner, check if person owns the car.
	 */
	@Test
	public void testSetOwner1() {
		Car c = new Car();
		Person p = new Person();
		c.setOwner(p);
		assertTrue(p.getCars().contains(c));
	}

	/**
	 * If car is told who is new owner, check if old owner no longer owns the
	 * car.
	 */
	@Test
	public void testSetOwner2() {
		Car c = new Car();
		Person p1 = new Person();
		c.setOwner(p1);
		Person p2 = new Person();
		c.setOwner(p2);
		assertFalse(p1.getCars().contains(c));
	}

	/**
	 * Tests if selling a car is correct by "telling" it the car.
	 */
	@Test
	public void testPersonSellsCar1() {
		// 1. step: establish object(s) and links:
		Person p1 = new Person();
		Person p2 = new Person();
		Car c = new Car();
		p1.addCar(c);

		// 2. step: operate on object(s):
		c.setOwner(p2);
		// p2.addCar(c);

		// 3. step: get result(s):
		Person newOwner = c.getOwner();
		Set<Car> carsOfP1 = p1.getCars();
		Set<Car> carsOfP2 = p2.getCars();

		// 4. step: assert expectations
		assertEquals(p2, newOwner);
		assertTrue(carsOfP2.contains(c));
		assertFalse(carsOfP1.contains(c));
	}

	/**
	 * Tests if selling a car is correct by "telling" it the new owner.
	 */
	@Test
	public void testPersonSellsCar2() {
		// 1. step: establish object(s) and links:
		Person p1 = new Person();
		Person p2 = new Person();
		Car c = new Car();
		p1.addCar(c);

		// 2. step: operate on object(s):
		// c.setOwner(p2);
		p2.addCar(c);

		// 3. step: get result(s):
		Person newOwner = c.getOwner();
		Set<Car> carsOfP1 = p1.getCars();
		Set<Car> carsOfP2 = p2.getCars();

		// 4. step: assert expectations
		assertEquals(p2, newOwner);
		assertTrue(carsOfP2.contains(c));
		assertFalse(carsOfP1.contains(c));
	}

	/**
	 * Test of underlying collection does not include "null" and, thus, a person
	 * can get rid of a car.
	 */
	@Test
	public void testAddNoCar() {
		Person p = new Person();
		p.addCar(null);
		assertEquals(0, p.getCars().size());
	}

	/**
	 * Tests if a person can get rid of a car.
	 */
	@Test
	public void testPersonGetsRidOfCar() {
		// 1. step: establish object(s) and links:
		Person p1 = new Person();
		Car c = new Car();
		p1.addCar(c);

		// 2. step: operate on object(s):
		// c.setOwner(p2);
		p1.removeCar(c);

		// 3. step: get result(s):
		Set<Car> carsOfP1 = p1.getCars();

		// 4. step: assert expectations
		assertFalse(carsOfP1.contains(c));
		assertNull(c.getOwner());
	}

	/**
	 * Tests the read-only property of the +cars, first more complicated
	 * variant.
	 */
	@Test
	public void testReadOnlyPropertyOfGetCars1() {
		Person p = new Person();
		Set<Car> cars = p.getCars();

		Car c = new Car();
		try {
			cars.add(c);
			fail("Should not be possible...");
		} catch (UnsupportedOperationException e) {
			// okay
		}
	}

	/**
	 * Tests the read-only property of the +cars, simple variant.
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void testReadOnlyPropertyOfGetCars2() {
		Person p = new Person();
		Set<Car> cars = p.getCars();

		Car c = new Car();
		cars.add(c);
	}
}
