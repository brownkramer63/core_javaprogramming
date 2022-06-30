package Replits.Arrays;

import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String[] list = str.split(", ");
        String shortest = list[0];
        String count = shortest;

        for(int i=1; i<list.length ; i++){
            if (shortest.length() == list[i].length()){
                shortest=list[i];
                count+=", "+shortest;
            }
            else if(list[i].length()< shortest.length()){
                shortest=list[i];
                count=shortest;
            }
        }
        System.out.println("["+count+"]");
    }

}
