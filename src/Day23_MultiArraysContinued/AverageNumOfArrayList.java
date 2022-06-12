package Day23_MultiArraysContinued;

import java.util.ArrayList;

public class AverageNumOfArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum =0;

        for (int each:list
             ) {
            sum=sum+ each;
        }

        double average = (double)sum/ list.size(); //have to cast one of the int here to a double to get a double result

        System.out.println("average = " + average);





    }
}//2. Write a program that can find the average number from an arrayList of integers
