package Day19_Arrays;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 =arr1;
        int[] arr3 =arr2;

        System.out.println("------------------");

        String[] a1 ={"umran","muhtar"};

        a1 = new String[]{"James","Daniel"};

        System.out.println(Arrays.toString(a1));






    }
}
