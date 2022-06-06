package day13_methodscontinued;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {

        int grade = new Scanner(System.in).next().charAt(0);

        boolean isvalid = grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F';

        if(!isvalid){//if the grade is not valid
            System.err.println("invalid grade");
            return;
        }

        switch (grade){
            case 'A':
                System.out.println("grade is excellent");
            break;
            case 'B':
                System.out.println("grade is great");
                break;
            case 'C':
                System.out.println("grade is good");
                break;
            case 'D':
                System.out.println("grade is pass");
                break;
            case 'F':
                System.out.println("fail you lose go back to start");
                break;
            default:
                System.out.println("wrong answer bud");

        }





    }
}
