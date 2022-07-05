package Day_34_Abstraction.CarTask;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void start(){
        System.out.println("To start twist the ignition key and pray it works to start "+getMake());
    }
    public void autopilot(){
        System.out.println("Yell park me to auto park "+getMake()+" "+getModel());
    }
}
