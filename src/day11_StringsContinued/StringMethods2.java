package day11_StringsContinued;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence =" I love python, python is the best programming language, and python is in high demand";

        String ssentence =sentence.replace("python","Java");

        System.out.println(ssentence);

        System.out.println("------------------------");

        String word ="java";

        word= word.replace('a','e');

        System.out.println(word);

        System.out.println("------------------------");

        String sentence2 = " I love Java, Java is cool";

        sentence2= sentence2.replaceFirst("Java","Python");

        System.out.println(sentence2);

        String sentence3 = "Java is fun, Java is cool, Java is amazing";//replace second java

        sentence3 = sentence3.replaceFirst(", Java",", Python");
        System.out.println(sentence3);

        System.out.println("--------------------");

        String sentence4 = " I love Java Programming";

       String languageName= sentence4.substring(8,12);

        System.out.println(languageName);

        String sentence5 = "Today is Sunday, Tomorrow is Monday";

        String wepracticebaby= sentence5.substring(9,15);

        System.out.println(wepracticebaby);

        String email = "gmail@yahoo.com";

        int beginning = email.indexOf("@")+1;
        int end = email.lastIndexOf(".");

        String domain =email.substring(beginning,end);
        System.out.println(domain);

        String sentence6 =" I love Java programming";

        String r1 = sentence6.substring(7, sentence6.length()-1+1);
        System.out.println(r1);

        System.out.println("----------------");

        String sentence7 ="Today is Sunday, Tomorrow is Monday";

        String r2 =sentence7.substring(29,sentence7.length());

        System.out.println(r2);

        String ikabaka = "python";

       String result= ikabaka.repeat(10);

        System.out.println(result);

























    }
}
