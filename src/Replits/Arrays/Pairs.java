package Replits.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }
        input.close();
        //WRITE YOUR CODE BELOW
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1 ; i++) {
            if (!(list.contains(arr[i]))){
                list.add(arr[i]+", "+arr[i+1]);
        }
        }
        for (String each:list
             ) {
            System.out.println(each);
        }

    }
}
