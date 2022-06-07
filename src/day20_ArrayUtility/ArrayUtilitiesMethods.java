package day20_ArrayUtility;

import java.util.Arrays;

public class ArrayUtilitiesMethods {
    public static void main(String[] args) {


        int[] score ={70,100,200,300};

        System.out.println(Arrays.toString(score));

        System.out.println("------------------------");

        //next is equals method

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 =Arrays.equals(a1,a2);

        System.out.println(r1);

        // if the elements and order are the same you will get true
        //if the elements are the same but not the order it will be false

        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","C","B"};

        System.out.println(Arrays.equals(s1,s2));

        //if you want to ignore the order but want to check if elements are the same need to use sort() first

        System.out.println("-----------------------------");

        int[] nums = {100,80,90,75,99};

        System.out.println(Arrays.toString(nums));

      Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        // how to find minimum number using sort method

        System.out.println("Minimum number: "+nums[0]);

        //how to find maximum number using sort method

        System.out.println("Max Number: "+nums[nums.length-1]);

        System.out.println("-----------------------------");

        //if you want to ignore the order but want to check if elements are the same need to use sort() first

        String[] b1 = {"A","B","C"};
        String[] b2 = {"A","C","B"};

        Arrays.sort(b1);
        Arrays.sort(b2);
        boolean bb=Arrays.equals(b1,b2);
        System.out.println(bb);

        System.out.println("-----------------------------");

        String[] students ={"JIM","Jerry","John", "Muhtar","Ali"};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------");

        //copy a array

        int[] array ={10,20,30,40,50,60,70};
        int[] array2 = Arrays.copyOf(array,array.length);
//                                   array we copy, length of array
        System.out.println(Arrays.toString(array2));

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {1,2,3,4,5,5,5,5,5,5,5,5,5};

        int[] n3 = Arrays.copyOf(n1,n1.length+n2.length);

        for (int i = 0,j=n1.length; i <n2.length ; i++, j++) {
            n3[j]=n2[i];
        }

        System.out.println(Arrays.toString(n3)); //answer will contain all elements of both arrays

        char[] ch = {'A','B','C','D','E','F'};

        char[] result1= Arrays.copyOf(ch,20);

        System.out.println(Arrays.toString(result1));

        char[] result2 =Arrays.copyOfRange(ch,2,4);

        System.out.println(Arrays.toString(result2));
















    }


}
