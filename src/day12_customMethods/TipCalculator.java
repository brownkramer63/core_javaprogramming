package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Split or No split (enter yes or no)");
        String split = input.next().toLowerCase();//will convert answer to lower case

        System.out.println("Enter number of people");
        int people = input.nextInt();

        System.out.println("Enter the check amount");
        double checkamount = input.nextDouble();

        System.out.println("Enter service quality (Excellent/Great/Good/Fair/Poor)");
        String quality = input.next().toLowerCase();

        // now we need a switch or ternary muhtar is using ternary statement to add in amounts for quality
        input.close();

        double totalTip = (quality.equals("excellent"))? checkamount*0.25 : (quality.equals("great"))? checkamount*0.20
                : (quality.equals("good"))? checkamount*0.15 : (quality.equals("fair"))? checkamount*0.10 :
                checkamount*0.05;

        double totaltopay = checkamount+ totalTip;

        System.out.println("Number of people: "+people);

        System.out.println("Total to pay: $"+totaltopay);

        System.out.println("Total tip: $"+totalTip);

        System.out.println("Total per a person: $"+totaltopay/people);

        System.out.println("Total tip per a person: $"+totalTip/people);











    }
}
