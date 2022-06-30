package Day_31_MethodOverloading.Shape;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
       // super(); this is being called implicitly
        setSide(side);
    }

    @Override
    public double area() {
       return side*side;
    }

    @Override
    public double perimeter() {
       return side*4;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square");
        System.out.println("\t* * * * * *");

        for (int i = 0; i < 3; i++) {
            System.out.println("\t*         *");
        }

        System.out.println("\t* * * * * *");

    }
}
