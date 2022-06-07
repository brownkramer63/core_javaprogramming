package day20_ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";

       char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("--------------------------");

        String str2 = "Today is a great day to learn Java";

       String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));








    }
}
