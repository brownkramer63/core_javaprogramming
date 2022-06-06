package day15_whileloop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        double num1 = input.nextDouble();

        System.out.println("enter your second number");
        double num2 = input.nextDouble();

        System.out.println("enter a math operator");

        char mathoperator=input.next().charAt(0);


        boolean validoperator= mathoperator=='+' || mathoperator=='-' || mathoperator=='*' || mathoperator=='/' || mathoperator=='%';

        while (!(validoperator)){
            System.err.println("invalid operator please reenter valid operator");
            mathoperator= input.next().charAt(0);
        }

        if(mathoperator=='+'){
            System.out.println(num1+num2);
        } else if (mathoperator=='-') {
            System.out.println(num1-num2);

        } else if (mathoperator=='*') {
            System.out.println(num1*num2);

        } else if (mathoperator=='/') {
            System.out.println(num1/num2);

        }else {
            System.out.println(num1%num2);


    }
}}
