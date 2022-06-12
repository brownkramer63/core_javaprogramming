package Day22_WrapperClass;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(40);
        numbers.add(407);
        numbers.add(409);
        numbers.add(40);
        numbers.add(40000);
        numbers.add(400);
        numbers.add(3,255);
        System.out.println(numbers);

        System.out.println("--------------------------");

        for (int i = 0; i < numbers.size() ; i++) {
            int each = numbers.get(i);
            System.out.println(each);
        } // how to print this array list








    }
}
