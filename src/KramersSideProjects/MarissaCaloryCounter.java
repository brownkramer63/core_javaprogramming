package KramersSideProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MarissaCaloryCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello Marissa Rose!");
        System.out.println("This program will measure how much you have eaten and tell you if you need more!");
        System.out.println("What do you think of that? Write your answer below");

        String answer1 = input.nextLine();

        System.out.println("Great!!!");
        System.out.println("Please enter what you have eaten one entry at a time and when you are done please enter done");

        //adding in the array here
        ArrayList<String> list2 = new ArrayList<>();
        int numberofthingseaten = 0;

        for (int i = 0; i >-1 ; i++) {
            String foods = input.next();


            list2.add(foods);
            numberofthingseaten++;
            if (foods.equalsIgnoreCase("done")){
                break;
            }
        }
        list2.remove("done");
        System.out.println(Arrays.asList(list2.size()));


     //   System.out.println(Arrays.asList(list2));
//used to check if all items were added to array, they were

        if (numberofthingseaten<6){ //this needs to be six because of numberofthings eaten plus done makes it 6 instead of 5
            System.out.println("Marissa Rose you need to eat more!!");
            System.out.println(Arrays.asList(list2)+" is not enough food!!");


        }else if(numberofthingseaten>=6){
            System.out.println("Good job Baby!!");
            System.out.println(Arrays.asList(list2)+" is enough food!!");
        }else {
            System.out.println("Something went wrong");
        }

        System.out.println("What did you eat for protein? Please enter in one line baby girl");
        String protein = input.nextLine();
        String protein1 = input.nextLine();

        System.out.println("And how many grams of protein is that? Please enter on the number");

        double proteinintake = input.nextDouble();

        if (proteinintake<=120){
            System.out.println("Baby eat more protein! "+protein1+" is not enough grams!!");
        }else {
            System.out.println(proteinintake+" is enough grams of protein good job!");
        }










    }
}
