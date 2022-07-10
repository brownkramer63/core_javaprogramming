package Day_30_InheritanceContinued;

public class Phone {

    private String model;
    private String size;
    private double price;
    private String color;

    public Phone() {

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

    public Phone(String model, String size, String s, double price, String color) {

     setModel(model);
    setSize(size);
    setPrice(price);
    setColor(color);



    }


    public String toString() {
        return getClass().getSimpleName()+"{" +

                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void text(long phonenumber){
        System.out.println(model+" is texting "+ phonenumber);
    }
}
