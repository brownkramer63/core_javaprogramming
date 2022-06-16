package Day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {
    public static void main(String[] args) {

//        int[] numbers ={1,2,3,4,5,6,7,8,9,4,4,2,2}; need an array list not an array

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,4,4,2,2));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<4){
//                list.remove(i);  this wont work because size is dynamic and everytime we remove an element it gets all messed up
                list.removeIf(p->p<4); //uses iterable idk how though muhtar gave us this, it works though
//p is each object in the arraylist above
            }
        }




        System.out.println(list);

        System.out.println("-------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python","C#","Java","Javascript", "C++"));

        //we want to remove all elements that start with J
         names.removeIf( each -> each.startsWith("J") );
//each= each element in the array list above
//-> just the thing inbetween the variable and condition

        System.out.println(names);

        System.out.println("------------------------------------");














    }
}
