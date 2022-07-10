package Day_36_Polymorphism;

import Day_30_InheritanceContinued.Nokia;
import Day_30_InheritanceContinued.IPhone;
import Day_30_InheritanceContinued.Phone;
import Day_30_InheritanceContinued.Samsung;



public class PolyMorphismPractice {
    public static void main(String[] args) {

        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Samsung","Galaxy S19", "Medium", 700,"Pink"),
                new Nokia("Nokia","d","Large",400,"Black"),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),

                new IPhone("Iphone 6", "Smalle", "Gold", 400),
                new IPhone("Iphone 7", "Smalle", "White", 500)
        };
//i coded different from the group so my code doesnt work with his group example
// messed up my code from day 30 will need to import the code from class notes
        for (Phone eachPhone: phones
             ) {
            System.out.println(eachPhone.getColor()+" - "+eachPhone.getPrice());
        }

        int countIphone=0;
        for (Phone each: phones
             ) {
            if (each instanceof IPhone)
                countIphone++;
        }
        System.out.println(countIphone);



        for (Phone each :phones) {
            if (each instanceof IPhone || each instanceof Samsung){
                if (each.getPrice()>=700){
                    System.out.println(each);
                }
            }
        }
















//        1. print the model, color and price of each phone object in the following format
//        model - color - price
//
//        2. How many Iphones in the array of phones?
//
//        3. How many Samsung in the array of phones?
//
//        4. Display the models of Iphones and samsung that has the price of 700 or greater




    }

}
