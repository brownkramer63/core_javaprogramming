package day20_ArrayUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 1, 2, 4, 5, 5};

        int[] reverse = new int[array1.length];

        for (int i = array1.length - 1,k=0; i >= 0; i--,k++) {
            reverse[k]=   array1[i];
        }

        System.out.println(Arrays.toString(reverse));

    }
}
//3. Write a program that can reverse the array

//            4