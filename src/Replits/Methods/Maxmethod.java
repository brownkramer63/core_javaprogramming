package Replits.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Maxmethod {
    public static class Main {

        // Write your code here

        public static int findMax(int[] arr){

           Arrays.sort(arr);


return arr[arr.length-1];
        }

        public static double findMax(double[] arr){

            Arrays.sort(arr);


            return  arr[arr.length-1];
        }












// DO NOT TOUCH THE MAIN METHOD

        public static void main(String [] args) {

            Scanner in = new Scanner(System.in);
            boolean runInt = in.nextBoolean();
            int size = in.nextInt();

            if(runInt) {
                int [] arr = new int[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println(findMax(arr));
            } else {
                double [] arr = new double[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextDouble();
                }
                System.out.println(findMax(arr));
            }

        }}}

