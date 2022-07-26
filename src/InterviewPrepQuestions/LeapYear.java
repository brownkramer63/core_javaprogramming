package InterviewPrepQuestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        System.out.println("Please enter a year");
        Scanner input = new Scanner(System.in);
       int year = input.nextInt();

       if (year%4==0 && (!(year%100==0)) || year%400==0){
           System.out.println("it is a leap year");
       }else {
           System.out.println("it is not a leap year");
       }






//        ▪ The leap year must be evenly divisible by 4.
//▪ But if the year can also be evenly divided by 100, it is not a leap year.
//▪ If the year is also evenly divisible by 400, it is a leap year.
    }
}
