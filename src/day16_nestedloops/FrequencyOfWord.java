package day16_nestedloops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java JaVa JAVA Java";

        String word= "Java";

        str =str.toLowerCase();
        word =word.toLowerCase();

        int count =0;

        while (str.contains(word)) {
            count++;
            str =str.replaceFirst("java","");//"Java Java Java"
        }
        System.out.println(count);





    }
}
