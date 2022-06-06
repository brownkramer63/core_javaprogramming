package lab03;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String answer ="";

        //WRITE YOUR CODE BELOW
        if(word1.length()==3 && word2.length()==3){

            answer= word1.charAt(0)+""+word2.charAt(0)+"" +word1.charAt(1)+""+word2.charAt(1)+"" +
                    word1.charAt(2)+""+word2.charAt(02)+"";
        }else{
            System.out.println("cannot merge");
        }
        System.out.println(answer);
        scan.close();
    }}
