package Day_35_Polymorphism.TransportationTask;

import Day_34_Abstraction.AnimalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {


    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    void land(){
        System.out.println("Plane "+ getMake()+" "+getModel()+" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is flying");
    }
}
