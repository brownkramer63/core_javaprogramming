package LabDay06Loops;

import Utilities.StringUtility;

public class CustomMethodPractice12_16 {
    public static void main(String[] args) {


        System.out.println(doubleeverychar("Cydeo"));

        System.out.println(Palidrome("level"));

    }
//Q12
    public static String doubleeverychar(String str){

        String result = "";
        for (int i = 0; i <str.length() ; i++) {

            char each = str.charAt(i);

            result +=each;
            result +=each; // these are included twice to add two chars to each iteration of the loop

        }
        return result;



     //   Given a string, return a string where for every char in the original, there are two chars.
    }

 //Q13

 public static boolean endinly (String str){

       return str.endsWith("ly");


        //Given a string, return true if it ends in "ly".
 }

//Q14

    public static boolean ifbad (String str){

        if (str.equals("bad")){
            return true;
        }
        if (str.length()<4){
         return false;
        }

        boolean bad1 = str.substring(0,3).equals("bad");

        boolean bad2 = str.substring(1,4).equals("bad");

        return bad1 || bad2;



//        Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
//        with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    }

//Q15
    public static String newstring (String str){

        if (str.isEmpty()){
            return "@@";
        } else if (str.length()==1) {
            return str+"@";
        }
        else {
            return str.substring(0,2);




        }


//        Given a string, return a string length 2 made of its first 2 chars. If the string
//        length is less than 2, use '@' for the missing chars.
    }

    //Q16

    public static boolean Palidrome(String str){

       return StringUtility.reverse(str).equalsIgnoreCase(str);






        //    Write a method that accepts a string and returns true if the string is palindrome.
    }




}
