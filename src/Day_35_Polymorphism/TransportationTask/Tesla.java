package Day_35_Polymorphism.TransportationTask;

public class Tesla extends Car implements Electric,AutoPilot{ //dont need to call autopark because autopilot is child of autopark

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }
}
