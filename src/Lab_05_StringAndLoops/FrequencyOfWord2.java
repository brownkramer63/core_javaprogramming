package Lab_05_StringAndLoops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String Sentence ="Java Java Java Java Python C# Ruby";

        int countJava =0;

//        while (Sentence.indexOf("Java")>=0){ first way to give this
// Sentence = Sentence.replaceFirst("Java","");
//        }
        while(Sentence.contains("Java")){ // while sentence has java
            Sentence = Sentence.replaceFirst("Java",""); // remove on java at a time
        }
        System.out.println(Sentence);


    }
}
