package Replits.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINES:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODES BELOW:
        ArrayList<String> Arrnew= new ArrayList<>();

        for (String each: arr){
            Arrnew.add(each);
        }
        Collections.reverse(Arrnew);

        System.out.println(Arrnew);

    }
}
