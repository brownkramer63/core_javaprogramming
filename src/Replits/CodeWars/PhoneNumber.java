package Replits.CodeWars;

public class PhoneNumber {
    public static void main(String[] args) {

    }
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!

       String s= "("+numbers[0]+numbers[1]+numbers[2]+")"+" "+numbers[3]+numbers[4]+numbers[5]+
                "-"+numbers[6]+numbers[7]+numbers[8]+numbers[9];

        return  s;
    }


}
