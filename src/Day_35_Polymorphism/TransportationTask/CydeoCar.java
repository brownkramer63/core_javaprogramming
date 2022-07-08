package Day_35_Polymorphism.TransportationTask;

import Day_34_Abstraction.AnimalTask.Flyable;

public class CydeoCar extends Car implements Flyable,Electric,AutoPilot {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }
}
