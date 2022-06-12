package Day23_MultiArraysContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);



        ArrayList<Integer> list = new ArrayList<>();

        list.add(69);

        list.addAll(numbers);
        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println(list);

        System.out.println("--------------------------");


        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,68,87,90));
        // what you paste into the addall needs to be a collection data type

        System.out.println(scores);

        System.out.println("----------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadit", "Hasan", "Niha","Bilal"));

        System.out.println(students); // this converts the string to a collection data type

        students.addAll(2,Arrays.asList("Loin","Shukur","Sunny"));
        //inserted these three elements at index 2
        System.out.println(students);

        System.out.println("---------------------");

        //you can put an array into this but need to make sure that array has no primitive in it or use wrapper on primitives

        Integer[] nums ={1,2,3,4,5}; //int in a wrapper class so we can put into the array list

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("------------------");

        ArrayList<String> employeelist = new ArrayList<>();
        employeelist.addAll(Arrays.asList("Poppi","kewl kid","John","godfather"));

        System.out.println(employeelist);

        boolean hasPoppi = employeelist.contains("Poppi");
        System.out.println(hasPoppi);

        boolean contains =employeelist.containsAll(Arrays.asList("Poppi","John","godfather"));
        System.out.println(contains);

        System.out.println("---------------------------");

        ArrayList<Integer> listnew = new ArrayList<>();

        listnew.addAll(Arrays.asList(10,10,20,30,45,50,60,789));
        listnew.removeAll(Arrays.asList(10,20));

        System.out.println(listnew);


        System.out.println("-----------------------------");








    }
}
