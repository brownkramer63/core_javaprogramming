package lab02;

import java.util.Scanner;

public class TrainBookingApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //if u want to use any property belongs to class need to create object

        System.out.println("has bags (please answer with true or false)");
        Boolean bags = input.nextBoolean();

        System.out.println("Direct transport only? please answer with true of false");
        Boolean nonstop = input.nextBoolean();


        System.out.println("transport type Train:1 Bus:2 Flight:3");
        int transporttype = input.nextInt();

        System.out.println("From:");
        String from = input.next();

        System.out.println("To:");
        String destination = input.next();

        String train1 = "TR001";
        String train2 ="TR002";
        String train3 ="TR003";
        String train4 ="TR004";
        String bus1 ="BS001";
        String bus2 ="BS002";
        String bus3 ="BS003";
        String flight1 ="FL001";
        String flight2 ="FL002";
        String flight3="FL003";

        if(!(from.equalsIgnoreCase("Berlin") && destination.equalsIgnoreCase("Amsterdam"))){
            System.out.println("For now, we can only serve you Berlin-Amsterdam transportation. Please change your destination");
        return;// this stops the JVM from continue to run code
        }
        switch (transporttype){
            case 1: //train
                if(nonstop && bags) {
                    System.out.println("you can take " + train3);
                    return;
                } else if (!nonstop && bags) {
                    System.out.println("you can take "+train1);

                }else if (!nonstop && !bags){
                    System.out.println("you can take "+train2);
                    }
                else {
                    System.out.println("you can take "+train4);
                    }

                break;
            case 2: //bus
                System.out.println("you can take "+bus1+bus2+bus3);
                break;
            case 3://flight
                if(nonstop && bags){
                    System.out.println("no available flight");
                    return;}
                else if (bags && !nonstop) {
                    System.out.println("you can take "+flight1);}
                else if (!bags && nonstop) {
                    System.out.println("you can take "+flight2);}else {
                    System.out.println("you can take "+flight3);}

                break;
            default:
                System.out.println("invalid input, please correct");




        }













    }
}
