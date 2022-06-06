package Day19_Arrays;

import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {


       int score1 = 85;
       int score2 = 85;
       int score3 = 85;
       int score4 = 85;
       int score5 = 85;
        System.out.println("-------------------");

        int [] scores = new int[5];
        scores[2]= 78;

        scores = new int[10]; // since we assigned a new array previous array will be eligable for garbage collection

        scores = new int [50];

        System.out.println( Arrays.toString(scores));
        scores[3]= 78;
        System.out.println(scores[3]);

        System.out.println("------------------");

        scores[49]=9;
        for (int i = 0; i <scores.length; i++) { //
            System.out.println(scores[i]);
        }
        System.out.println("-------------------");

        System.out.println(scores[scores.length-1]); // to print last index number

        System.out.println("-----------------------");






    }
}
