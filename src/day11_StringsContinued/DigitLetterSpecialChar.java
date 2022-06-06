package day11_StringsContinued;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please write word: ");

        String char1 = input.next();
        if (char1.length() >= 1) {
            char firstcharacter =char1.charAt(0);// the first character of string
            if(firstcharacter>=48 && firstcharacter<= 57){System.out.println("first character is digit");}

            else if (firstcharacter>='a' && firstcharacter<='z' ) {System.out.println("first character is lower case");}

            else if (firstcharacter>='A' && firstcharacter<= 'Z') {System.out.println("first character is upper case");}

            else {System.out.println("first character is special character");}}

            else{//if string is empty
            System.out.println("invalid input string is empty");}

















    }
}
//Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
//            - if the word starts with digits, print "first character is digit"
//            - if the word starts with uppercase letters, print "first character is lowercase letter"
//            - if the word starts with lowercase letters, print "first character is uppercase letter"
//            - if the word starts with special characters, print "first character is special character"