package Replits.Arrays;

import java.util.*;

public class TimesTwo {
    //create your method below
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int each: nums){

            list1.add(each*2);


        }


return (list1);
    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }


}
