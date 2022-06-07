package Utilities;

public class ArraysUtilitycustom {

    public static int[] mergearrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];//to make sure that 3rd array has enough capacity to contain all the elements of array 1 and array 2

        int k = 0; // place holder for 3rd array

        for (int i = 0; i < arr1.length; i++,k++) { //i: first arrays index number

            arr3[k]=arr1[i]; //adding arr1 to arr3
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i for seconds arrays index number
            arr3[k]= arr2[i];
        }
        return arr3;
    }

    public static double[] mergearrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length+arr2.length];//to make sure that 3rd array has enough capacity to contain all the elements of array 1 and array 2

        int k = 0; // place holder for 3rd array

        for (int i = 0; i < arr1.length; i++,k++) { //i: first arrays index number

            arr3[k]=arr1[i]; //adding arr1 to arr3
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i for seconds arrays index number
            arr3[k]= arr2[i];
        }
        return arr3;
    }

    public static char[] mergearrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length+arr2.length];//to make sure that 3rd array has enough capacity to contain all the elements of array 1 and array 2

        int k = 0; // place holder for 3rd array

        for (int i = 0; i < arr1.length; i++,k++) { //i: first arrays index number

            arr3[k]=arr1[i]; //adding arr1 to arr3
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i for seconds arrays index number
            arr3[k]= arr2[i];
        }
        return arr3;
    }

    public static String[] mergearrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];//to make sure that 3rd array has enough capacity to contain all the elements of array 1 and array 2

        int k = 0; // place holder for 3rd array

        for (int i = 0; i < arr1.length; i++,k++) { //i: first arrays index number

            arr3[k]=arr1[i]; //adding arr1 to arr3
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i for seconds arrays index number
            arr3[k]= arr2[i];
        }
        return arr3;
    }
}
