package LabDay06Loops;

import java.util.Scanner;

public class ReplitPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int result =1;
        for(int i=n; i>0; i--){

            System.out.println(i*(result));
result+=i;
        }


    }
}
