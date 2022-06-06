package day16_nestedloops;

import java.util.Scanner;

public class OddorEvenNestedLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

while(true) {

    System.out.println("Enter a number");
    int number = input.nextInt();

    if (number % 2 == 0) {
        System.out.println(number + " is an even number");
    } else {
        System.out.println(number + " is an odd number");
    }
    System.out.println("Would you like to enter another number? yes or no ");

    String answer = input.next().toLowerCase();

    while(!(answer.equals("no") || answer.equals("yes")))
    {
        System.err.println("invalid answer please answer with yes or no");
        answer= input.next().toLowerCase();
    }
    if (answer.equals("no")){
        break;
    }
}


    }
}
