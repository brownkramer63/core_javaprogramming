package Replits;

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        //Enter your code here

        Scanner scan = new Scanner (System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstname = scan.next();
        System.out.println("Enter your last name");
        String lastname = scan.next();




        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your work phone number");
        long workphone = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalphone = scan.nextLong();
        System.out.println("Enter your age");
        int age =scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you Married?");
        boolean married = scan.nextBoolean();








        scan.close();
    }
}
