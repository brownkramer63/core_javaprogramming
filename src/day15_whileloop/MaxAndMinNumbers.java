package day15_whileloop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int max = -548574754;
        int min=487437681;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = input.nextInt();

            if(num>max){
                num=max;
            }
            if(num<min){
                num=min;
            }
        }






    }
}
