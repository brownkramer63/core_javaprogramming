package Day_39_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(100);
        arraylist.add(100);
        arraylist.add(100);

        arraylist.get(0);

        LinkedList<Integer> linkedListlist = new LinkedList<>();

        linkedListlist.add(100);
        linkedListlist.add(100);
        linkedListlist.add(100);

        linkedListlist.remove(0 ); //node based class (double linked list)

    }
}
