package Day_31_MethodOverloading;

public class Car extends Vechile{


    public Car(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void drive(){
        System.out.println(getModel()+" is a smooth drive");
    }
}
