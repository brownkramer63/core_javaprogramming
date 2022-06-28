package Replits.Arrays;

import java.util.Scanner;

public class REVERSE {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

        int[] reverse = new int[sentence.length()];

        for (int i = sentence.length() - 1, j=0; i >= 0; i--) {
         //   reverse[j++]= sentence[i];
        }
        System.out.println(reverse);
    }
}
