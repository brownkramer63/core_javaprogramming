package Replits;

import java.util.Scanner;

public class ReturnwordcountMethod {

    public static int wordCount(String words) {
        // this is counting words so need to add 1 to account for starting word then count spaces
        // your code
        int count =1;
        for(int i = 0; i<words.length(); i++){
            if(words.charAt(i)==' '){
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
