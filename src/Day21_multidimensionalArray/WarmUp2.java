package Day21_multidimensionalArray;

import java.util.Arrays;

public class WarmUp2 {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        String[] a1 = str1.split("");
        String[] a2 = str2.split("");

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));







    }
}
////
//2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)
//
//        Ex: str1 = "heart"
//        str2 = "earth"
//
//        output:
//        true
//
//        str1 = "java"
//        str2 = "python"
//        output:
//        false