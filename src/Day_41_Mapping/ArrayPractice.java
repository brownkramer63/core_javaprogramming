package Day_41_Mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,2,3,4,5));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(100,20,30,40,50));

        List<Integer>[] arrayofLists = new List[3];

        arrayofLists[0]=list1;
        arrayofLists[1]=list2;
        arrayofLists[2]=list3;

        System.out.println(Arrays.toString(arrayofLists));

        arrayofLists[0].set(2,14);

        System.out.println(Arrays.toString(arrayofLists));

        Set<Integer>[] arrayofSets = new Set[5];

        System.out.println(Arrays.toString(arrayofSets));



    }
}
