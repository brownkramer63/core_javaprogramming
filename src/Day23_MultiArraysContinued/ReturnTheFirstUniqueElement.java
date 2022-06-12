package Day23_MultiArraysContinued;

import java.util.ArrayList;

public class ReturnTheFirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for (Integer element:list
             ) {


//        int element =1; only good for 1 instance

            int frequency = 0;

            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency==1){  //this needs to be in the loop to access the variable
                System.out.println(element);
                break; //once condition is true it will exit loop so you will only find the first unique element
        }



    }
}}//3. Write a program that can return the first unique elements from an array list
//            Ex:
//                    ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}
//
//                    output:
//                    2

