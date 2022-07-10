package Day_30_InheritanceContinued;

public class Nokia extends Phone{
    public Nokia(String brand, String model, String size, double price, String color) {
        super("Nokia", model, size, price, color); //we know brand of objects in nokia class should be nokia
    }

//    public void selfdefense(){
//        System.out.println(getBrand()+" "+getModel()+" can be used for self defense");
//    }


}
