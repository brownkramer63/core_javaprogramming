package day09_ScannerClass;

import java.util.Scanner;

public class DasysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write a number of the week 1-7");
        int num = input.nextInt();

        String day = "Invalid";
        if(num >=1 && num <= 7){
            day =(num==1)? "Monday" : (num==2)?"Tuesday": (num==3)? "Wednesday": (num==4)?"Thursday":(num==5)?"Friday"
                    :(num==6)?"Saturday":"Sunday";


        }
        System.out.println("Day is "+day);
        input.close();

    }
}
