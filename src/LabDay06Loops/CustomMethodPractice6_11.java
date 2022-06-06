package LabDay06Loops;

import Utilities.StringUtility;

public class CustomMethodPractice6_11 {
    public static void main(String[] args) {

        System.out.println(nestedstring("hihi","Hello"));

        System.out.println(rotateleft2("food"));

        System.out.println(rotateright2("Muhtar"));

        System.out.println(countString("hi hi hi hi hi hi","hi"));

        System.out.println(str1equalsstr2(" kramer  marissa ","kramer","marissa"));

    }

    //Q#6
    public static String nestedstring (String a, String b){

        String result = "";
        if (a.length()>b.length()){
            result = b+a+b;
            return result;
        }else if (a.length()<b.length()){
            result = a+b+a;
            return result;
        }else{ // need this in case strings are same length
            result=a+b;
            return result;
        }


//        Given 2 strings, a and b, return a string of the form short+long+short, with the shorter
//        string on the outside and the longer string on the inside.
    }

    //Q#7
    public static String rotateleft2 (String a){

        if (a.length()<=2){
            return a;
        }
        String result ="";
        String sub1 = a.substring(0,2);
        String sub2= a.substring(2);
        result= sub2+sub1;
        return result;

//        Given a string, return a "rotated left 2" version where the first 2 chars are moved to the
//        end. The string length will be at least 2
    }

    //Q#8
    public static String rotateright2 (String a){

        if (a.length()<3){
            return a;
        }
        String result ="";
        String sub1 = a.substring(a.length()-2);
        String sub2 = a.substring(0,a.length()-2);
        result = sub1+sub2;
        return result;


//        Given a string, return a "rotated right 2" version where the last 2 chars are moved to the
//        start. The string length will be at least 2.
    }

    //Q#9
    public static boolean frontagain (String a){
       if (a.length()<2){
           return false;
       }

      String firstTwoChars = a. substring(0,2);
       String lastTwoChars= a.substring(a.length()-2);

       return firstTwoChars.equals(lastTwoChars); // since this first char equals other it will return true

        //        Given a string, return true if the first 2 chars in the string also appear at the end of the
//        string, such as with "edited"
        }

        //Q#10
     public static int countString (String str, String word){
      int count = 0;
      while (str.contains(word)){
         str= str.replaceFirst(word,"");
          count++;

      }

      return count;
       //  Return the number of times that the string "hi" appears anywhere in the given string.
    }

    //Q#11
    public static boolean str1equalsstr2 (String sentence, String str1, String str2){

      int countstr1=  StringUtility.frequency(sentence,str1);
       int countstr2= StringUtility.frequency(sentence,str2);

       return countstr1==countstr2;

//        Return true if the string "cat" and "dog" appear the same number of times in the given
//        string.
    }




}
