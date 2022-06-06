package day10_StringIntro;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname = input.nextLine();
        System.out.println("Enter your building number");
        String buildingnumber= input.nextLine();
        System.out.println("Enter your Steet name");
        String streetname = input.nextLine();
        System.out.println("Enter your city name");
        String cityname = input.nextLine();
        System.out.println("Enter your state");
        String state = input.next();
        System.out.println("Enter your zip code");
        int Zipcode = input.nextInt();

        System.out.println("Your shipping address is");
        System.out.println(fullname);
        System.out.println(buildingnumber+" "+streetname);
        System.out.println(cityname+", "+state+" "+Zipcode);

        input.close();



    }
}
