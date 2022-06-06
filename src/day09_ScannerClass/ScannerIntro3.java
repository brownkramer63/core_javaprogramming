package day09_ScannerClass;
import java.util.Scanner;
public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("enter a character");
        char ch = input.next().charAt(0);

        System.out.println("you have entered: "+ch);
        System.out.println("Would you like to continue?");

      //  String answer= input.next();// this will only return on word for more words need the below function
       // String answer= input.nextLine();// this will return the whole line
        String answer = input.nextLine();
        System.out.println("you have entered: "+ answer);
        input.close();








    }
}
