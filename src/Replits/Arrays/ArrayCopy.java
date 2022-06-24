package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
    public static int[] mergR(int[] a,int[] b) {

        int a1 =a.length;
        int b1 = b.length;
        int c1 = a1+b1;
        int[] c = new int [c1];

        System.arraycopy(a, 0, c, 0,a1);
        System.arraycopy(b, 0 , c, a1,b1);



        return c;




    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }
}
