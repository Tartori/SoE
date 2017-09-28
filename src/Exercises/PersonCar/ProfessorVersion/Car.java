/*
 * Copyright (c) 2015 by Eric Dubuis
 * Berner Fachhochschule
 * Biel, Switzerland
 *
 * Project Giant Car Simulator
 */
package Exercises.PersonCar.ProfessorVersion;

/**
 * @author Eric Dubuis
 */
public class Car {
	private Person owner;

	/**
	 * @return the owner
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * @param p
	 *            the owner to set
	 */
	public void setOwner(Person p) {
		if (this.owner != null) {
			this.owner.friendCars().remove(this);
		}
		this.owner = p;
		if (this.owner != null) {
			this.owner.friendCars().add(this);
		}
	}
}
