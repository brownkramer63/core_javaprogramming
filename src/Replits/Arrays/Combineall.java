package Replits.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combineall {
  //  create your method below
    public static ArrayList<String> combineRs(String[] r1,String[] r2){
        ArrayList<String> list3 = new ArrayList<>();

        for (String each:r1
             ) {
            list3.add(each);
        }

        for (String eachs:r2
             ) {
list3.add(eachs);
        }

      return list3;

    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }
}
