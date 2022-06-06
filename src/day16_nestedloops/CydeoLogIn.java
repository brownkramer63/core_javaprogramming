package day16_nestedloops;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {
        String username = "Cydeo";

        String password ="WoodenSpoon";

        Scanner input = new Scanner(System.in);





                System.out.println("Please enter username");
                String usernamein = input.next();

                System.out.println("Please enter password");
                String passwordin = input.next();




                if (username.equals(usernamein) && password.equals(passwordin)){
                    System.out.println("Logged in");

                }else {
                    for (int i = 2; i >= 0; i--) {

                System.err.println("invalid credentials please try again");
                        System.out.println("enter your username");
                         usernamein = input.next();

                        System.out.println("Please enter password");
                        passwordin = input.next();

                        if (username.equals(usernamein) && password.equals(passwordin)){
                            System.out.println("you are now logged in");
                            break;
                        }else {
                            System.err.println(i +" attempts remaining");
                            continue;

                        }

            }
               if (!username.equals(usernamein) && password.equals(passwordin)){
                   System.err.println("Your account is now locked, please contact the support team");
               }

        }





input.close();

    }
}
