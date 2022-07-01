package Day_32_FinalKeyWord.CarMethodOverLoading;

public class Audi extends Car{
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press start button to start"+getMake()+" "+getModel());
    }
}
