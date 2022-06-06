package day10_StringIntro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EMployeeInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your full legal name");
        String fullname= input.nextLine();
        System.out.println("enter your age ");
        int age = input.nextInt();
        String filler1 = input.nextLine();
        System.out.println("enter your gender");
        char gender =input.next().charAt(0);
        String filler2 = input.nextLine();
        System.out.println("enter your company name");
        String companyname = input.nextLine();
        System.out.println("enter your job title");
        String jobtitle = input.nextLine();
        System.out.println("Enter your Salary");
        int salary = input.nextInt();

        System.out.println(fullname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyname);
        System.out.println(jobtitle+" the salary is "+salary);

        input.close();













    }

}
//2. Create a class named EmployeeInfo and Ask the user to:
//        2.1 Enter your full name
//        2.2 Enter your age
//        2.3 Enter your gender
//        2.4 Enter your company name
//        2.5 Enter your job title
//        2.6 Enter your salary
//
//        Display:
//        Employee's name
//        EMployee's age
//        Employee's gender
//        Company name
//        Employee's job title
//        Employee's salary