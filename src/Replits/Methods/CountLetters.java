package Replits.Methods;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }
    //string is kramer

    public static String countLetters(String str){
        int numberofletters =0;
         char letter = ' ';
         String result ="";
         String answer="";

        for(int i =0; i<str.length(); i++){

        letter = str.charAt(i);
        numberofletters=0;

            for (int j = 0; j <str.length() ; j++) {

                if (letter==str.charAt(j)){
                    numberofletters++;
                }
                if (letter==str.charAt(j) && (! result.contains(letter+""))){
                    result = result+letter;
                }else {
                    continue;
                }


            }



        }




return answer;
    }





}
