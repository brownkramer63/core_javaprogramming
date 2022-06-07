package day20_ArrayUtility;

import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {

int[] oddnumber = {1,2,3,4,5}; // array is fixed you cannot increase of decrease it, but you can increase/decrease values inside the array

        for (int i = 0; i < oddnumber.length; i++) {
         if(oddnumber[i]%2==1){
             oddnumber[i] =    oddnumber[i] * 2; // this is how you reassign it back to array
         }
        }
        System.out.println(Arrays.toString(oddnumber));

    }
}
//1. write a program that can multiply each odd number of an integer array by 2
//                ex:
//                    array = [1,2,3,4,5];
//
//                output:
//                    array =[2,2,6,4,10]