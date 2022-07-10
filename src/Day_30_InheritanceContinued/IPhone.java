package Day_30_InheritanceContinued;

public class IPhone extends Phone {

//    public Iphone(String brand, String model, String size, double price, String color){
//       super(brand, model, size, price, color);
//    } // this is a constructor with the constructor from the parent class called



    public static boolean hasApplyPay =true;

    public IPhone(String brand, String model, String size, double price, String color) { //just let intellij do it
        super("Apple", model, size, price, color);

    }

    public IPhone(String brand, String large, String black, int price) {
        super();
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel()+" is face timing with "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel()+ " is face timing with "+email);
    }


}
