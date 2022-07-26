package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringSentence {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:
        String answer ="";
        String[] arr = sentence.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            if (i==0){
                System.out.println(arr[i]);}else {
            System.out.print(arr[i]+" ");}

        }

    }
}
