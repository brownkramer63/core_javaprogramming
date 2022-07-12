package Replits.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveInstance {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        int count = 0;

        for (int each:r
             ) {
            if (each!=n){
                output.add(each);
            }
        }
return output;


    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }


}
