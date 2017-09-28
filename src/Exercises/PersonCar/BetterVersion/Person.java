package Exercises.PersonCar.BetterVersion;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private Set<Car> cars;

    public Person(){
        cars=new HashSet<>();
    }

    public Collection<Car> getCars(){
        return Collections.unmodifiableCollection(cars);
    }

    public void addCar(Car car){
        if(car!=null && !cars.contains(car)){
            cars.add(car);
            car.setOwner(this);
        }
    }

    public void removeCar(Car car){
        cars.remove(car);
        car.setOwner(null);
    }

    public boolean containsCar(Car car){
        return cars.contains(car);
    }
}
