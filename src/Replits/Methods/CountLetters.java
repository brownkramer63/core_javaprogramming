package Replits.Methods;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println("add");
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }
    //string is kramer

    public static String countLetters(String str) {

        String temp;
        int letterCount;
        String result = "";
        while (str.length() != 0){
            String letter = str.substring(0,1);
            temp = str.replaceAll(letter,"");
            letterCount = str.length() - temp.length();
            result += letterCount+letter;
            str = temp;
        }

return result;
}}
