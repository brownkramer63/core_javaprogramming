package Replits.Arrays;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class MaxNum {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW
        sort(nums);

        System.out.println(nums[nums.length-1]);

    }
}
