package Day_34_Abstraction.CarTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void start(){
        System.out.println("batteries are better so push to start"+getMake()+" "+getModel());
    }






}
