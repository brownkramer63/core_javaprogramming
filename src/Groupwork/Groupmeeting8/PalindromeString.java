package Groupwork.Groupmeeting8;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter word/phrase");

        String palindrome = input.nextLine();
        palindrome= palindrome.toLowerCase();
        palindrome=palindrome.replace(" ","");

        System.out.println(palindrome);
        String reverse ="";

        int palindromeLength = palindrome.length();

        for (int i = (palindromeLength-1); i >=0 ; --i) {
            reverse=reverse+palindrome.charAt(i);
        }
        if (palindrome.equals(reverse)){
            System.out.println(palindrome+ " is a palindrome");
        }else {
            System.out.println(palindrome+ " is not a palindrome");
        }

    }
    public static boolean isPalindrome(String word) {

        String reverse = "";

        word = (word.toLowerCase().replace(" ", ""));

        for (int i = word.length() - 1; i >= 0; i--) { //reverse word
            reverse += word.charAt(i);

        }

        if (!(word.equals(reverse))) { // outside the fori loop
            return false;
        }
        return true;

    }
}
