package Day25_Constructor;


import day17_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class DogWarmup {
    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");


        ArrayList<Dog>smalldogs = new ArrayList<>(Arrays.asList(dogs));//when we add Arrays.asList(dogs)
        //it adds all of these lists from the array into the array list


//        for (Dog each:dogs this is with a loop
//             ) {
//            if (each.size.equals("Small")){
//            smalldogs.add(each);
//            }
//        }
//        System.out.println(smalldogs);

     smalldogs.removeIf(p -> p.size.equals("Small"));

        System.out.println(smalldogs);

        ArrayList<Dog> youngdog= new ArrayList<>(Arrays.asList(dogs));


        youngdog.removeIf(p -> p.age>4);
        System.out.println(youngdog);






    }
}
