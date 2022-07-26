package InterviewPrepQuestions;

import java.util.Scanner;

public class NonRepeatingVowel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter word");
        String word = input.next();
        input.close();

        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                int count = 0;
                for (int j = 0; j <word.length() ; j++) {
                    if (ch==word.charAt(j)){
                        count++;
                    }
                }
                if (count==1){
                    System.out.println("index "+i);
                    break;
                }else if (i==word.length()-1){

                    System.out.println("no non repeating vowels");
                    break;
                }


            }

        }





//        Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its
//        index. If it doesn't exist, return -1. Assume that all the characters of the String is lowercase.

    }
}
