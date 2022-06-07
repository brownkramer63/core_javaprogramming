package Day19_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {


    char[] ascending = new char[26]; // index: 0~25
        char[] decending = new char[26];

        for (int i = 0,j='A' , k ='Z'; i < ascending.length; i++,j++, k--) {
            ascending[i]=(char) j; //explicit casting to char instead of integer dont know how that works
            decending[i]=(char) k;
        }





        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(decending));

        System.out.println("--------------------------");

        char[] characters= new char[65535]; // all of the chars there are

        for (int i = 0; i <characters.length ; i++) {
            characters[i]= (char) i;
        }

        System.out.println(Arrays.toString(characters));

}}

//3. Create a char array and store all the alphabet letters in ascending order
//
//	4. Create a char array and store all the alphabet letters in descending order