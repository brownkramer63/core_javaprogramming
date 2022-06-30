package Replits.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combineall {
  //  create your method below
  ArrayList<Integer> list3 = new ArrayList<Integer>();
    public static ArrayList<Integer> combineAL(ArrayList<Integer> list, ArrayList<Integer> list2){
        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll((list));
        list3.addAll((list2));

      return list3;

    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }
}
