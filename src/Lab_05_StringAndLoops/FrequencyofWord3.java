package Lab_05_StringAndLoops;

public class FrequencyofWord3 {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;

        for (int i = 0; i <= sentence.length()-4; i++) {// we put -4 here to not get an error when we run loop
            String each = sentence.substring(i,i+4);//to count the characters in groups of 4
            System.out.println(each);
            if (each.equals("Java")){
                countJava++;
            }

        }
        System.out.println("amount of Java in sentence: "+ countJava);





    }
}
