package Day27_StaticsContinued;

public class Car { //outter class
    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ //this is a inner class idk how though
        //inner class can use all outer class instance variables

        public void method(){
            System.out.println(make);
            System.out.println(wheels);

        }

    }

    public static class StaticInnerClass{
        // if the inner class is static you do not need obj from outer class to call this

        public void method(){
            System.out.println(wheels);//can accept this because it is static


        }


    }



}
