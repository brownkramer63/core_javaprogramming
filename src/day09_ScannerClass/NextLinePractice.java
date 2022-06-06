package day09_ScannerClass;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);// enter enter

        System.out.println("enter your full name");

        String fullname = input.nextLine();//kramer brown enter reads whole line

        System.out.println("enter your school name");
        String schoolname =input.nextLine(); // cydeo school enter reads whole line

        System.out.println("enter you gender: ");
        String gender = input.next(); //male extra enter into scanner

        System.out.println("Enter your age");

        int age = input.nextInt();// 28 extra enter into scanner

        System.out.println("enter street name");

        String filler1 =input.nextLine(); // add this to get rid of extra enter that is added cause of the integer being used


        String address = input.nextLine(); // 510 milwaukee reads whole line






    }
}
