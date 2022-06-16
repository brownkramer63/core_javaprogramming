package Groupwork;

import java.util.Locale;
import java.util.Scanner;

public class CountTheNumberOfDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String example = input.nextLine();

        String examples = example.toLowerCase();

        int count = 0;

        char array[] = examples.toCharArray();

        for (int i = 0; i < array.length ; i++) {
            count = 1;

            for (int j = i+1; j < array.length ; j++) {
            if (array[i] == array[j] && array[i]!=' '){
                count++;
                array[j]=0;
            }
            }

            System.out.println((array[i]+"")+" occurs "+count);


        }




    }
}
