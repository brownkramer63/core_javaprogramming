package day12_customMethods;


import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {

        String first = "cyDEo";

        String last = "SCHOOL";

        String firstpart =first.substring(0,1).toUpperCase();
                // we have the lower case c in this string, we can call a substring and an upper case in same line
        String firstparttwo = first.substring(1).toLowerCase();

        String lastpart =last.substring(0,1).toUpperCase();
        String lastparttwo = last.substring(1).toLowerCase();

        System.out.println(firstpart+firstparttwo+" "+lastpart+lastparttwo);








    }
}
