package day15_whileloop;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age: ");

        int age = input.nextInt(); // valid age should be between 1~120

        while(!(age>=1 && age<=150)){
            System.out.println("Please reenter your age invalid entry");
            age= input.nextInt();
        }


        System.out.println("are you a US citizen Yes/No");
        String yesorno = input.next().toLowerCase();

        while(!(yesorno.equals("yes") || yesorno.equals("no"))){
            System.err.println("invalid entry please answer with yes or no");
         yesorno = input.next().toLowerCase();
        }




        if (age>=18 && yesorno.equals("yes")){
            System.out.println("eligible to vote");
        }else {
            System.out.println("not eligible to vote");
        }


    }
}
