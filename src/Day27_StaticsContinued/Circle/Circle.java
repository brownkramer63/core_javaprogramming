package Day27_StaticsContinued.Circle;

public class Circle {

    public double radius;
    public double diameter;

    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2; //dont need to add this as it is being called through the radius
    }

    public double area(){
        return (radius*radius)*pi;
    }

    public double perimeter(){
        return 2*pi*radius;
    }

    public static void printpi(){
        System.out.println("pi = " + pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", Area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
