package day15_whileloop;

import java.util.Scanner;

public class maximumnumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -22222220;

        for(int i= 0; i<5; i++){
            System.out.println("enter number: ");
            int userinput = input.nextInt();

            if(userinput> max){
                max=userinput;
            }
        }
        System.out.println("max = " + max);

        input.close();


    }
}
//1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
//
//2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number
//
//3. Write a program that can remove the duplicated characters from the a string
//
//                Ex:
//                    str = "aabbbcccc"
//
//                    output:
//                        abc