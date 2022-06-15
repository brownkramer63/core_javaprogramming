package Replits;

import java.util.Scanner;

public class Triplescharacterloop {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        for (int i = 0; i < str.length()-2; i++) {
            char c= str.charAt(i);
            if (c == str.charAt(i+1)&& c== str.charAt(i+2)){
                count++;
            }
        }System.out.println(count);

        }

    }

