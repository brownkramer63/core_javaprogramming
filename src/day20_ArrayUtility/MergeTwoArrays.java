package day20_ArrayUtility;

import java.util.Arrays;
import Utilities.ArraysUtilitycustom;

public class MergeTwoArrays {
    public static void main(String[] args) {

       int[] arr1 = {1,2,3,4};
       int[] arr2 = {5,6};

       int[] arr3 = new int[arr1.length+arr2.length];//to make sure that 3rd array has enough capacity to contain all the elements of array 1 and array 2

        int k = 0; // place holder for 3rd array

        for (int i = 0; i < arr1.length; i++,k++) { //i: first arrays index number

             arr3[k]=arr1[i]; //adding arr1 to arr3
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i for seconds arrays index number
            arr3[k]= arr2[i];
        }


        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------");

        int[] a1 = {1,2,5,8,9,6,8};
        int[] a2 = {4,4,4,4,4,9};

int[] a3 =ArraysUtilitycustom.mergearrays(a1,a2);

        System.out.println(Arrays.toString(a3));

        System.out.println("---------------------------");

        double[] b1 = {40.4,56.6,3.5,5.5};
        double[] b2 ={20.5,44.4};

       double[] b3= ArraysUtilitycustom.mergearrays(b1,b2);

        System.out.println(Arrays.toString(b3));

        System.out.println("----------------------------------");

        char[] ch1 ={'A','B','C'};
        char[] ch2 ={'X','Y','Z'};

        char[] ch3 = ArraysUtilitycustom.mergearrays(ch1,ch2);

        System.out.println(Arrays.toString(ch3));

        String[] c1 = {"Kramer","C++"};
        String[] c2 ={"Marissa","Python"};

        String[] c3 =ArraysUtilitycustom.mergearrays(c1,c2);

        System.out.println(Arrays.toString(c3));



    }
}
//2. write a program that can merge two arrays of integers
//        Ex:
//            arr1 = {1,2,3,4}
//            arr2 = {5,6}
//
//        output
//            arr3 = {1,2,3,4,5,6}