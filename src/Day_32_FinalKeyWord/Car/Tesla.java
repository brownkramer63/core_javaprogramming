package Day_32_FinalKeyWord.Car;

import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void setModel(String model) {
       String[] models =   {"Model S", "Model Y", "Model x", "Model 3" };
       if (!Arrays.asList(models).contains(model)){
           System.err.println("Invalid Tesla model: "+model);
           System.exit(1);
       }
       super.setModel(model);

    }

    @Override
    public void setColor(String color) {
        String[] colors =  {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"};
        if (!Arrays.asList(colors).contains(color)){
            System.err.println("invalid color for tesla");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {

        if (price<50000){
            System.err.println("invalid price");
        System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void start() {
        System.out.println("To start say start to start"+getMake()+" "+getModel());
    }

    public void autoPilot(){
        System.out.println(getMake()+" "+getModel()+" has an autopilot function");
    }




}
//Extra Conditions for the variables:
//                    1. Model of tesla can only be set to one of the followings:
//                        {"Model S", "Model Y", "Model x", "Model 3" };
//                    2. color of tesla can only be set to one of the followings:
//                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
//                    3. year of the tesla can not be less than 2008
//                    4. price of tesla can not be less than 50k