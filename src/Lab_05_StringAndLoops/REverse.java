package Lab_05_StringAndLoops;

public class REverse {
    public static void main(String[] args) {

        String word = "Wooden Spoon";
        // need to get chars from last index to zero
        String result ="";

        for (int i = word.length()-1; i >=0 ; i--) {// i : index number of the strin gword starting from last index to 0

            char each = word.charAt(i); // characters starting from last character to first character

            result +=each;

        }

        System.out.println(result);

    }
}
