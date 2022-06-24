package Replits.Arrays;

import java.util.Scanner;

public class EveninArray {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:
        int count = 0;
        for(int each: nums){

            if(each%2==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
