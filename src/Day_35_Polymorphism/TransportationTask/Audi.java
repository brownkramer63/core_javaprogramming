package Day_35_Polymorphism.TransportationTask;

public class Audi extends Car implements autoPark{
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
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
