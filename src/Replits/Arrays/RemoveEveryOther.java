package Replits.Arrays;

import java.util.*;
import java.util.Scanner;

public class RemoveEveryOther {
    //create your method below
    public static ArrayList<String> removeEveryOther(ArrayList<String> words){

        ArrayList<String> list1 = new ArrayList<>();

        for(String each:words){
            if( words.indexOf(each)%2!=0)
            {
                list1.add(each);
            }
        }

    return list1;


    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }
}
