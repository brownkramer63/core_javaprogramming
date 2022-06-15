package Replits;

import java.util.Scanner;

public class LoopParty {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW
        String guestlist = "";

        for(int i=0; i<100;i++){

            System.out.println("Please enter the guest's name:");

            String guestname = input.next();
            guestlist = guestlist+", "+guestname;

            System.out.println("Do you want to enter another guest's name?");
            String answer = input.next();

            if(answer.equals("no")){
                System.out.println("Guests' list: "+ guestlist.substring(2,guestlist.length()));
                break;
            }


        }

    }
}
