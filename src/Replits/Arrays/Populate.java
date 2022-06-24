package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Populate {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
    }
    //CREATE YOUR METHOD
    public  static void populate(int n){
        int count = 1;
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i]= count++;


        }
        System.out.println(Arrays.toString(arr));
    }
}
