package Day_30_InheritanceContinued;

public class Samsung extends  Phone{


    public Samsung(String brand, String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" freezes a lot");
    }



}
