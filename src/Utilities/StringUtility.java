package Utilities;

public class StringUtility {

    public static String reverse(String str){
        String reverse="";

        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }


        return reverse;
    }

    public static int frequency (String str, String word){
        int count = 0;
        while (str.contains(word)){
            str= str.replaceFirst(word,"");
            count++;

        }

        return count;
        //  Return the number of times that the given word appears anywhere in the given string.
    }

    public static boolean str1equalsstr2 (String sentence, String str1, String str2){

        int countstr1=  StringUtility.frequency(sentence,str1);
        int countstr2= StringUtility.frequency(sentence,str2);

        return countstr1==countstr2;

//        Return true if the string "cat" and "dog" appear the same number of times in the given
//        string.
    }

//    public  static String removeDup(String str){
//        for (int i = 0; i <str.length() ; i++) {
//            char each = str.charAt(i);
//
//        }
//        return each

}
