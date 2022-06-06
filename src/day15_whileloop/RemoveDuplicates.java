package day15_whileloop;



public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result ="";// at the end will contain new string abc


        for (int i = 0; i < str.length(); i++) { //i: index numbers of str

            char each = str.charAt(i);// each character of the String str

            if(!result.contains(""+each)){//if the string result does not container the character of string str yet
                result+=each; //then we will add the character to string result
            }
        }
        System.out.println(result); //will give answer



    }
}
