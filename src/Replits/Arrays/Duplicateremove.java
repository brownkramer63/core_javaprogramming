package Replits.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicateremove {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:

        int[] nums = {6, 44, 6, 4, 3, 4, 1};

        //WRITE YOUR CODE BELOW:
        ArrayList<Integer> output = new ArrayList<>();
        int count = 0;
        for(int each: nums){
            for (int each1:nums
                 ) {
                if (each1==each){
                    count++;

            }

        }
            if (count==1){
                output.add(each);
            }
            count=0;
    }
        System.out.println(output.get(0));

}
}
