package Day_40_CollectionsContinued;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();
        list.add(4);
        list.addAll(Arrays.asList(3,3,3,3,3,3,56));

        System.out.println(list);

        System.out.println(((ArrayList<Integer>) list).get(1));




    }
}
