package day11_StringsContinued;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter String 1: ");

        String string1 = input.nextLine();

        System.out.println("Please enter String 2");

        String string2 = input.nextLine();


        if (string1.length() > string2.length()){
            System.out.println("String 1 is larger");}else if (string1.length()<string2.length()){
            System.out.println("String 2 is larger");} else if (string1.length()== string2.length()) {
            System.out.println("String 1 and 2 are equal");}
        else {
            System.out.println("invalid input");}


        input.close();
    }
}
