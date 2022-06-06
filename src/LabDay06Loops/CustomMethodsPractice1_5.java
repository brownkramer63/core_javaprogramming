package LabDay06Loops;

public class CustomMethodsPractice1_5 {
    public static void main(String[] args) {

        System.out.println(   helloname("Kramer"));

        System.out.println(twoStringsconcat("kramer","Marissa"));

        System.out.println(threecopieslastchar("kramer"));

        System.out.println(firsttwochars("Richard"));

        System.out.println(withoutfirstandlastchar("Marissa"));



    }
    //Q#1
public static String helloname(String name){

return  "Hello "+name+"!";
    //Create a method that accepts 1 string, e.g. "Bob", return a greeting of the form "Hello
//Bob!".
}
//Q#2
public static String twoStringsconcat(String a, String b){

String result = a+b+b+a;

return result;

//    Create a method that accepts two strings, a and b, return the result of putting them
//    together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

}

//Q#3
public static String threecopieslastchar(String str){

        if (str.length()<2){
            return str;
        }

        String characters = str.substring(str.length()-2);

        String result = characters.repeat(3);
        return result;

//    Create a method return a new string made of 3 copies of the last 2 chars of the original
//    string. The string length will be at least 2.
}

//Q#4
public static String firsttwochars (String str){
if (str.length()<=2){
    return str;
}
String result = str.substring(0,2);

return result;


//    Given a string, return the string made of its first two chars, so the String "Hello" yields
//    "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and
//    the empty string "" yields the empty string ""
}

//Q#5
public static String withoutfirstandlastchar (String str){

if (str.length()<=3){
    return str;
}
String result = str.substring(1,str.length()-1);

return result;

//    Given a string, return a version without the first and last char, so "Hello" yields "ell". The
//    string length will be at least 2.
}


}

