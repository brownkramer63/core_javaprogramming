package Lab_05_StringAndLoops;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
        int position =0;
        int length1 =0;

        if(word.length()%2==0){
            position =word.length()/2;
            length1 =2;
        }
        else {
            position=word.length()/2;
            length1=1;
        }
        String position1 = word.substring(position,position+length1);
        System.out.println(position1);
        }


}
