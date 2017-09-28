package Exercises.PersonCar.BetterVersion.Test;

import Exercises.PersonCar.BetterVersion.Car;
import Exercises.PersonCar.BetterVersion.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class PersonTest {
    @Test
    public void assertEmptyCarListIsActuallyEmpty(){
        Person person = new Person();
        Collection<Car> cars = person.getCars();
        Assert.assertTrue(cars.isEmpty());
    }

    @Test
    public void assertCarGoesIntoList(){
        Person person = new Person();
        Car car = new Car();

        person.addCar(car);

        Collection<Car> cars = person.getCars();
        Assert.assertFalse(cars.isEmpty());
        Assert.assertTrue(cars.contains(car));
    }

    @Test
    public void assertCarGoesIntoListWithoutDuplicates(){
        Person person = new Person();
        Car car = new Car();

        person.addCar(car);
        person.addCar(car);
        Collection<Car> cars = person.getCars();
        Assert.assertFalse(cars.isEmpty());
        Assert.assertTrue(cars.contains(car));
        Assert.assertEquals(cars.size(), 1);
    }

    @Test
    public void assertHandOverCar(){
        Person person = new Person();
        Person person2 = new Person();
        Car car = new Car();

        person.addCar(car);
        person2.addCar(car);

        Collection<Car> cars = person.getCars();
        Collection<Car> cars2 = person2.getCars();
        Assert.assertTrue(cars.isEmpty());
        Assert.assertFalse(cars2.isEmpty());
        Assert.assertTrue(cars2.contains(car));
        Assert.assertEquals(car.getOwner(), person2);
    }

    @Test
    public void assertMultipleCarsGoIntoList(){
        Person person = new Person();
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        person.addCar(car);
        person.addCar(car2);
        person.addCar(car3);

        Collection<Car> cars = person.getCars();
        Assert.assertFalse(cars.isEmpty());
        Assert.assertTrue(cars.contains(car));
        Assert.assertTrue(cars.contains(car2));
        Assert.assertTrue(cars.contains(car3));
    }

    @Test
    public void assertCarCanBeRemoved(){
        Person person = new Person();
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        person.addCar(car);
        person.addCar(car2);
        person.addCar(car3);
        person.removeCar(car);

        Collection<Car> cars = person.getCars();
        Assert.assertFalse(cars.isEmpty());
        Assert.assertFalse(cars.contains(car));
        Assert.assertTrue(cars.contains(car2));
        Assert.assertTrue(cars.contains(car3));
    }

    @Test
    public void assertCarOwnerIsSet(){
        Person person = new Person();
        Car car = new Car();

        person.addCar(car);

        Collection<Car> cars = person.getCars();
        Assert.assertEquals(car.getOwner(), person);
    }

    @Test
    public void assertCarOwnerIsSetToNullOnRemove(){
        Person person = new Person();
        Car car = new Car();

        person.addCar(car);
        person.removeCar(car);

        Collection<Car> cars = person.getCars();
        Assert.assertNull(car.getOwner());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void assertCollectionCantBeModified(){
        Person p = new Person();
        Car c = new Car();
        p.getCars().add(c);
        Assert.fail("The Test should throw an exception");
    }
}

