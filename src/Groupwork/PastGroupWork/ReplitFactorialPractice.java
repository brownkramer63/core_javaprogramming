package Groupwork.PastGroupWork;

import java.util.Scanner;

public class ReplitFactorialPractice {
    public static void main(String[] args) {


        //DO NOT TOUCH THESE LINES
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int number = 1;
        for(int i=1; i<=n; i++){

            number = number*i;

        }
        System.out.println(number);

        String word = scan.nextLine();

        //WRITE YOUR CODE BELOW

        for(int j=0;j<=word.length();j++){

            System.out.println(word.charAt(j));
        }


    }
}
