package Exercises.PersonCar.BetterVersion.Test;

import Exercises.PersonCar.BetterVersion.Car;
import Exercises.PersonCar.BetterVersion.Person;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void assertEmptyOwnerEqualsNull(){
        Car car = new Car();
        Person owner = car.getOwner();
        Assert.assertNull(owner);
    }

    @Test
    public void assertSetOwnerNotEqualsNull(){
        Car car = new Car();

        car.setOwner(new Person());
        Person owner = car.getOwner();

        Assert.assertNotNull(owner);
    }

    @Test
    public void assertSetOwnerEqualsGetOwner(){
        Car car = new Car();
        Person p = new Person();

        car.setOwner(p);
        Person owner = car.getOwner();

        Assert.assertEquals(owner, p);
    }

    @Test
    public void assertSetOwnerAddsCarToOwner(){
        Car car = new Car();
        Person p = new Person();

        car.setOwner(p);
        Person owner = car.getOwner();

        Assert.assertTrue(owner.containsCar(car));
    }

    @Test
    public void assertOwnerCanBeSetToNull(){
        Car car = new Car();
        Person p = new Person();

        car.setOwner(p);
        car.setOwner(null);
        Person owner = car.getOwner();
        Assert.assertNull(owner);
    }

    @Test
    public void assertOwnerCanBeSetToNullAndCarIsRemovedFromOwner(){
        Car car = new Car();
        Person p = new Person();

        car.setOwner(p);
        car.setOwner(null);
        Person owner = car.getOwner();
        Assert.assertNull(owner);
        Assert.assertFalse(p.containsCar(car));
    }
}
