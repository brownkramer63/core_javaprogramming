package Day19_Arrays;

import java.util.Scanner;

public class Replitlooppractice1 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int day = 0;
        for (; inhabitants>0 ; inhabitants/=2)   {

            System.out.println("Day " + day + " [" + inhabitants +"]");
day++;
        }
        System.out.println("---- EXTINCT ----");

    }
}
