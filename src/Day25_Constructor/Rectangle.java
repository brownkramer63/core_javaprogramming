package Day25_Constructor;

public class Rectangle {

    public double length, width;
    //these are the attributes we have added

    //actions below

    public double area(){

        return length*width;
    }
//    public void setInfo(double length, double width){
//
//       this.length=length;
//               this.width=width;
//    }
    //we just right clicked and generated below method
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public Rectangle(double length, double width){ // this is our constructor
        this.length=length;
        this.width=width;
    }


}
