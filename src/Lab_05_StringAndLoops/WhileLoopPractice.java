package Lab_05_StringAndLoops;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to continue? yes/no");
        String a = input.nextLine();

        while(!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
            System.out.println("invalid entry please reenter yes or no");
        }



    }

}
