package Day23_MultiArraysContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------");

        ArrayList<String> grocerylist = new ArrayList<>();

        grocerylist.add("Eggs");
    grocerylist.add("paper towels");
    grocerylist.add("apples");
    grocerylist.add("cooking oil");
    grocerylist.add("muffins");

        System.out.println(grocerylist);

        grocerylist.set(2,"oranges");

        System.out.println(grocerylist);

        grocerylist.add(2,"chicken");

        System.out.println(grocerylist);

        System.out.println("-------------------------"); //hung out with marissa here, need to catch up

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Marissa");
        names.add("Marissa");
        names.add("Sumeye");
        names.add("crocodile");
        names.add("Sumeye");

        System.out.println(names.indexOf("Marissa"));

        System.out.println(names.lastIndexOf("Sumeye"));




    }
}
