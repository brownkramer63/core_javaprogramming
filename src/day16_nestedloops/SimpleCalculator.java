package day16_nestedloops;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer ="yes";
        while (answer.equals("yes")) {

            System.out.println("Please enter a number");
            double number1 = input.nextDouble();

            System.out.println("Please enter a valid operator");
            char operator = input.next().charAt(0);
            while (!(operator == '/' || operator == '*' || operator == '-' || operator == '+' || operator == '%')) {
                System.err.println("invalid operator please enter a valid operator");
                operator = input.next().charAt(0);
            }

            System.out.println("Please enter a second number");
            double number2 = input.nextDouble();

            double result = (operator == '+') ? number1 + number2 : (operator == '-') ? number1 - number2 : (operator == '*') ?
                    number1 * number2 : (operator == '/') ? number1 / number2 : number1 % number2;

            System.out.println("result = " + result);

            System.out.println("Would you like to continue? yes or no");

            answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Answer, please answer with yes or no");
                answer = input.next().toLowerCase();
            }



        }
    }
}
