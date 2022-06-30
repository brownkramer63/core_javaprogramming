package Day_31_MethodOverloading.Vechiles;

public class Bike extends Vechile{
    public Bike(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void ride(){
        System.out.println(getModel()+" is a smooth ride");
    }


}
