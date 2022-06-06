package day15_whileloop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter age: ");

        int age = input.nextInt();

        while(!(age>=1 && age<=150)){
            System.out.println("Please reenter your age");
            age= input.nextInt();
        }

        if(age>=21){
            System.out.println("Eligible");
        }else {
            System.out.println("not eligible");
        }




    }
}
