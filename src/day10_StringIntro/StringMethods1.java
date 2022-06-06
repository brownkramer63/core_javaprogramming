package day10_StringIntro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {


        String str="Cyedo";
        // index 01234

        char firstChar = str.charAt(0);
        char second= str.charAt(1);
        System.out.println("firstChar = " + firstChar);
        System.out.println("second = " + second);

        System.out.println("------------------");
        String s1 ="Wooden Spoon";

        char first = s1.charAt(0);
        int lastint =s1.length()-1;

        char last =s1.charAt(lastint);

        System.out.println(first);
        System.out.println(last);

        System.out.println("-------------------");

        String name1="Umran";

        String name2 =new String("Umran");

        System.out.println(name2==name1);
        System.out.println(name1.equals(name2));

        System.out.println("--------------------");

        String r1 ="Java";
        String r2 = "Java";

        System.out.println(r1==r2);

        String r3= new String("Java");

        System.out.println(r1.equals(r3));

        System.out.println("---------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("how old are  you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if (age>=21 && answer.equals("yes")){
            System.out.println("eligible to vote");}else{
            System.out.println("not eligible");}











    }
}
