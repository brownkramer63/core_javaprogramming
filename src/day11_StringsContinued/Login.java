package day11_StringsContinued;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String correctUsername= "Cydeo",
                correctPassword ="WoodenSpoon";

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter username");

        String username = input.next();

        System.out.println("Please enter password");

        String password = input.next();

        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("you are logged in");}else{
            System.out.println("invalid username or password. Please try again");
        }
















    input.close();
    }
}
