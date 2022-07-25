package Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        double totalcost = 0;
        int itemcount=0;
        for (int i = 1; i <100 ; i++) {
            itemcount++;
            System.out.println("Enter the name of item "+itemcount);
            String item = input.next();
            System.out.println("Enter the price of the "+item);
            double itemprice = input.nextDouble();
            System.out.println("How many "+item+" will you buy?");
            int itemamount = input.nextInt();

            list.add( item+" x "+itemamount+" - $"+itemamount*itemprice);
            totalcost+=itemamount*itemprice;
            System.out.println("Do you want to add more items to the shopping list?");
            String itemanswer = input.next();



            if (itemanswer.toLowerCase().equals("no")){
                System.out.println("SHOPPING LIST:");
                for (String each:list
                ) {
                    System.out.println(each);
                }
                System.out.println("Total cost: $"+totalcost);
                break;
            }
        }

        input.close();
    }
}
