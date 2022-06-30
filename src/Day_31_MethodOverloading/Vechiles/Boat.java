package Day_31_MethodOverloading.Vechiles;

public class Boat extends Vechile{
    public Boat(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void sail(){
        System.out.println(getModel()+"is a smooth sailing experience.");
    }


}
