package Day_35_Polymorphism.TransportationTask;

public abstract class Transportation {

    private final String make;
    private final String model;
    private String color;
    private final int year;
    public double price; //5 instance variables and 3 are final

    //to use final we need a constructor i think


    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
       setPrice(price);
    }

    //now we can set our final variables

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void transportPeople();

    public abstract void start();

    //this will be the same for all, is an instance method
    public void stop(){
        System.out.println("shut off engine");
    }

    //need to string as well to print object even though i thought we could create objects from this class


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
