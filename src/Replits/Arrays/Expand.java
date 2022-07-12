package Replits.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Expand {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();

        }

        //WRITE YOUR CODE BELOW
        ArrayList <Integer> list= new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            list.add(nums[i]);
        System.out.println(list);

    }
}
