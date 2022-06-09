package Day21_multidimensionalArray;

import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {

      String    str = "  Hello world      I      love      Java    ";

      str =str.trim();

        System.out.println(str);

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for (String each :words) {
            if(!each.isEmpty()){
                str+=each+" ";
            }
        }
        System.out.println(str);



    }
}
//1. Write a program that can remove all the extra space from string
//            Ex:
//                str = "  Hello world      I      love      Java    "
