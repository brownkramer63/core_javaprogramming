package Day23_MultiArraysContinued;

import java.util.ArrayList;

public class CollectionClassMethods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Marissa");
        names.add("Marissa");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("crocodile");
        names.add("Sumeye");

        ArrayList<String> nonDuplicates = new ArrayList<>();

        for (String each:names
             ) {
            if (nonDuplicates.contains(each)){
                continue;
            }
            nonDuplicates.add(each);
        }

        System.out.println(nonDuplicates);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2= list1;

        list1.add(10); // they are calling the same exact object in the memory heap

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2); // will be true


        ArrayList<Integer> l1 = new ArrayList<>();

        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1==l2); // different allocation in the heap memory

        //to check if the elements are the same

        System.out.println(l1.equals(l2)); // will return true

        System.out.println("-----------------------");

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();

        n2.add(20);
        n2.add(10);
        n2.add(30);

        System.out.println(n1.equals(n2)); //will return false because element order is wrong

























    }
}
