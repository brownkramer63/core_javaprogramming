package Day19_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        // create two arrays 1-100 and the other 100-1

        int[] practice1 = new int[100];

        for (int i = 0, j =10; i < practice1.length; i++,j+=10) {
            practice1[i]=j;
        }
        System.out.println("Arrays.toString(practice1) = " + Arrays.toString(practice1));

        for (int i = 0; i < practice1.length; i++) {
            practice1[i]=i+1;
        }
        System.out.println("Arrays.toString(practice1) = " + Arrays.toString(practice1));

        System.out.println("---------------------------");

        int[] practice2 = new int [100]; //0~99

        for (int i = 0, j =100; i < practice2.length; i++,j--) {
            practice2[i]= j;
        }
        System.out.println(Arrays.toString(practice2));

        
        
        
        
        
    }
}
