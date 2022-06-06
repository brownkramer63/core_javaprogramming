package day15_whileloop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int min = 540404040;

        for (int i = 0; i <5 ; i++) {
            System.out.println("enter a number");
            int num =input.nextInt();

            if(num<min){
                min=num;
            }


        }

        System.out.println("min = " + min);
input.close();
    }
}
