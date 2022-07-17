package Day_40_CollectionsContinued;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

//        for (Integer each :list) {
//            if (each<5){
//                list.remove(each);
//            }
//        }

//        for (int i = 0; i <list.size() ; i++) { //these are two different remove methods one is an element one is an object
//            if (list.get(i)<5){
//                list.remove(i);
//            }
        // this did not remove all the elements less than five, this is because the list size is changing everytime we remove something


  /*
        for (Integer each : list) {
            if(each < 5){
                list.remove(each);
            }
        }
      */


        for (int i = 0; i < list.size(); i++) {
        if(list.get(i) < 5){
            list.remove(i);
        }
    }

        System.out.println(list);


        System.out.println("--------------------");

        List<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){
            Integer each= it.next();
            if (each<5){
                it.remove();
            } //this is the only way to remove elements from collection
        }

        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();){

            //this a loop that has a fixed iteration
            Integer each =i.next();
            if (each<5){
                i.remove();
            }
        }
        System.out.println(list3);// to use a condition with iterator in a for loop the one above is with the while loop
        //while loop is the preferred method



    }
}
