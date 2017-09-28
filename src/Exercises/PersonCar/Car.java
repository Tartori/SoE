package Exercises.PersonCar;

public class Car {

    private Person owner;

    public Person getOwner(){
        return owner;
    }

    public void setOwner(Person owner){
        if(this.owner!=null && this.owner.equals(owner))return;
        if(this.owner!=null && this.owner.containsCar(this)) {
            this.owner.removeCar(this);
        }
        this.owner=owner;
        if(owner != null && !owner.containsCar(this))
            owner.addCar(this);
    }
}
