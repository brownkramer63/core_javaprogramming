package Day22_WrapperClass;

import java.awt.*;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> List2 = new ArrayList<>();

        List2.add(10); //autoboxing to wrapper integer

        List2.add(9); //index 0
        List2.add(30); // index 1
        List2.add(9); //index 2
        //List2,add(5.5)cannot add this as its a double

        List2.add(1,14);// different overloaded add method need to have index number before you can add it
// it will insert itself and move the element that the index provided is at to the right so this will move element
        // at index 1 to index 2

        System.out.println(List2);

        List2.add(2,25);

        System.out.println(List2);
        System.out.println("-----------------------------");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Kramer");
        studentList.add("Muhtar");
        studentList.add("Adelina");
        studentList.add("Mohammad");
        System.out.println(studentList.size());

        System.out.println( studentList.get(0)); // could assign this to a string then print string

        String laststudent = studentList.get(studentList.size()-1);
        System.out.println(laststudent);









    }
}
