package day09_ScannerClass;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

      //Scanner keyboard = new Scanner(System.in);

        Scanner input = new Scanner(System.in); //for reading user inputs

        System.out.println("Enter a number");

        int num1 = input.nextInt();

        System.out.println("You entered "+num1);

        System.out.println("enter your second number");

        short num2 =input.nextShort();

        System.out.println("your second number entered: "+num2);

        System.out.println("enter your third number");

        int num3 = input.nextInt();

        System.out.println("your third number is "+num3);

        long num4 = input.nextLong();

        System.out.println("your fourth number is"+num4);

input.close();


    }
}
