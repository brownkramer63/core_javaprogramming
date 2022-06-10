package Day21_multidimensionalArray;

import java.util.Arrays;

public class MultiArrayexample {
    public static void main(String[] args) {

        int[][] arrd1 = { {1,2}, {3,4}  };

        int[][] arrwd2= { {1,2,3}, {2,3,4,5}, {4,5,44}};

        // only a 3 dimensional container can be a container for 3 dimensional array

        int[][][] arr3d = {arrd1,arrwd2};

        System.out.println(Arrays.deepToString(arr3d[1]));


    }
}
