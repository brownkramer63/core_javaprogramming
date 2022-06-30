package Day_31_MethodOverloading;

public class Airplane extends Vechile{
    public Airplane(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void Fly(){
        System.out.println(getModel()+" is a nice way to fly.");
    }
}
