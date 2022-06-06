package Lab_05_StringAndLoops;

public class FrequencyOfAWord {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java Python C# Ruby";

        String temp = sentence;

        int originalLength = sentence.length();

        temp = temp.replace("Java","aaa"); // just need replacement to have 3 characters
        //each Java will be replaced by aaa

        int newlength = temp.length();

        System.out.println(originalLength);
        System.out.println(newlength);
        System.out.println("frequency of java in this sentence: "+(originalLength-newlength));


    }
}
