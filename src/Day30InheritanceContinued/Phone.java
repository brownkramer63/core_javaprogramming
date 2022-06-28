package Day30InheritanceContinued;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!(color.equals("Black") || color.equals("White") || color.equals("Silver") || color.equals("Gold") ||color.equals("Pink") )){
            System.err.println("invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public Phone(String brand, String model, String size, double price, String color) {
       setBrand(brand);
     setModel(model);
    setSize(size);
    setPrice(price);
    setColor(color);



    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
