/*
 * Copyright (c) 2015 by Eric Dubuis
 * Berner Fachhochschule
 * Biel, Switzerland
 *
 * Project Giant Car Simulator
 */
package Exercises.PersonCar.ProfessorVersion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Eric Dubuis
 */
public class Person {
	private Set<Car> cars = new HashSet<>();

	public Set<Car> getCars() {
		return Collections.unmodifiableSet(cars);
		// return cars;
	}

	public void addCar(Car aCar) {
		if (aCar != null) {
			aCar.setOwner(this);
		}
	}

	public void removeCar(Car aCar) {
		if (aCar != null) {
			aCar.setOwner(null);
		}
	}

	Set<Car> friendCars() {
		return cars;
	}
}
