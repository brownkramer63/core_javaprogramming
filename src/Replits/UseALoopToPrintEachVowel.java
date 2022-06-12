package Replits;

import java.util.Scanner;

public class UseALoopToPrintEachVowel {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW
        String result = "";

        for( int i = 0; i<word.length(); i ++){

            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                result= result+ ""+word.charAt(i) ;
            }

        }
        System.out.println(result);
    }}
