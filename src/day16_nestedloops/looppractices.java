package day16_nestedloops;

import java.util.Scanner;

public class looppractices {
    public static void main(String[] args) {

        for (int i = 1; i<6; i++){
            System.out.println("Hello "+ i);
        }

        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello "+i);

        }
        System.out.println("-------------");


        int j =0;
        while(j <5){
                j++;
            System.out.println("Hello "+j);

        }

        System.out.println("--------------------");

        int k = 0;

        do {
            k++;
            System.out.println("Hello "+k);
        }while(k<5);

        System.out.println("--------------------------");

        System.out.println("Enter your score");

        Scanner input = new Scanner(System.in);

        int score = input.nextInt();

        while (score>100 || score<0){ //while the score is invalid
            System.out.println("invalid entry, please reenter score ");
            score = input.nextInt();
        }

        if(score>=60){
            System.out.println("you have passed");
        }else {
            System.out.println("failed");
        }














    }
}
