package Day_32_FinalKeyWord.Car;

public class BMW extends Car{

    public BMW(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start to start"+getMake()+" "+getModel());
    }
}
