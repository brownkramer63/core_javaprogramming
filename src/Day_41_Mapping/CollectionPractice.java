package Day_41_Mapping;

import DAy_33_Abstraction.Employee;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,2,3,4,5));

        List<List<Integer>> list = new ArrayList<>();
        //this a nested list or also known as list of list

        list.addAll(Arrays.asList(list1, list2));

        System.out.println(list.get(0));

        System.out.println("----------------------");

//        List<int[][]> l= new ArrayList<>(); this will work
//we are trying to get 10 out of list 2
        System.out.println(list.get(1).get(0));

        //if we want to print the elements out for list we would need a nested loop

        List<Set<Integer>> listofsets = new ArrayList<>();

        listofsets.add(new LinkedHashSet<>());
        listofsets.add(new LinkedHashSet<>());
        listofsets.add(new LinkedHashSet<>());
        listofsets.add(new LinkedHashSet<>());

        System.out.println(listofsets);

        listofsets.get(0).add(10);
        listofsets.get(0).add(5);
        listofsets.get(0).add(20);
        listofsets.get(1).addAll(Arrays.asList(1,2,3));

        System.out.println(listofsets);

        System.out.println("-----------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {10,20,30};

        List<int[]> listofarrays = new ArrayList<>();
        listofarrays.add(arr1);
        listofarrays.add(arr2);

//        System.out.println(listofarrays); gives us hashcode

//        System.out.println(listofarrays.get(0)); will also give us hashcode
        System.out.println(Arrays.toString(listofarrays.get(0)));
        listofarrays.get(0)[2]=35; // replace an element in an array
        System.out.println(Arrays.toString(listofarrays.get(0)));

        System.out.println("-----------------------------");

        List<List<Employee>> teams = new ArrayList<>();




    }


}
