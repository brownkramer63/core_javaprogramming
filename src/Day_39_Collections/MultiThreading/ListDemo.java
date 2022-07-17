package Day_39_Collections.MultiThreading;

import java.util.Stack;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {


        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(100);
        vector.add(100);

        System.out.println("------------------------------");

        Stack<Integer> stack= new Stack<>();

        stack.add(100);
        stack.add(200);
        stack.add(300);

        stack.get(0);

        stack.pop(); // returns the last element and removes it wierd

        System.out.println(stack   );












    }
}
