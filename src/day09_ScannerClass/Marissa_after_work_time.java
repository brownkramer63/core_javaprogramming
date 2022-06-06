package day09_ScannerClass;

import java.util.Scanner;

public class Marissa_after_work_time {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("-----------------");
        System.out.println("its still janky :( so you have to answer with 1 or 2. 1 is yes 2 is no");
        System.out.println("----------------");
        System.out.println("Hello Baby Cakes! Would you want to work out today?");

       int workout = input.nextInt();


        if (workout==1){
            System.out.println("alright lets go after work!");}else {
            System.out.println("want num nums? instead?");}

        String filler1 = input.nextLine();

        System.out.println("Do you want panda express later tonight?");
        int food = input.nextInt();
        if(food==1){
            System.out.println("Hell yeah I'll drive!");}else {
            System.out.println("what do you want then beatiful?");}

    }
}
