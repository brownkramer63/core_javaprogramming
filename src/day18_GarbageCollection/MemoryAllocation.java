package day18_GarbageCollection;

class Car{
    public String color;
    public String brand;
    public String model;

}
public class MemoryAllocation {
    public static void main(String[] args) {

        int a =100; // stored in stack

        Car car = new Car();
        // stack // new is in the heap
        // automatic value is null


    }

    public static void method1(){

        int b =200; // stored in stack

    }
    public static void method2(){

        String c = " Hello World"; //stored in heap as it is referencing an object this is known as a reference variable
        // the variable c will be in the stack but the string object will be in the heap

        String d = new String ("Hello World");// variable d will be in the stack
        // the string will be in the heap // string pool is in the heap but even a string literal is in the heap
        // just outside the string pool
    }


}
