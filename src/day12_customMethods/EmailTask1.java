package day12_customMethods;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please write email");
        String email =input.next();

        String firstname= email.substring(0, email.indexOf("_"));

        String lastname =email.substring(email.indexOf("_")+1,email.indexOf("@"));

        String domain = email.substring(email.indexOf("@"));

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(domain);

        email = lastname+"_"+firstname+domain;

        System.out.println(email);








    }
}
