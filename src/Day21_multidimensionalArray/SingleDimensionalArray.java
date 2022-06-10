package Day21_multidimensionalArray;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int[] arrd1 = new int [10];

        System.out.println(Arrays.toString(arrd1));

        System.out.println("-----------------------");
        int[][] arr2d = new int [5][]; //index 0~4

        arr2d[0] = arrd1;

        System.out.println(Arrays.deepToString(arr2d));



    }
}
