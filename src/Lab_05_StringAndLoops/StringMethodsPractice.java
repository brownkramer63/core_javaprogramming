package Lab_05_StringAndLoops;

import java.util.Locale;

public class StringMethodsPractice {
    public static void main(String[] args) {

        String name ="Kramer Brown";
        String name2 = "Cydeo School";
        //            0123456789.....

        char ch =name.charAt(4);

        System.out.println(ch);

        char lastchar = name.charAt(name.length()-1);
        System.out.println(lastchar);

        System.out.println("------------------------------");

        String school= "Cydeo School";

        int index1 = school.indexOf('l'); // make sure to remember index of is an int
        System.out.println(index1);

        int index2 = school.indexOf('j');

        System.out.println(index2);

        String str1 = "Java Programming Language";
        System.out.println("look here");
        int index3 = str1.indexOf("a ");
        int index4 = str1.lastIndexOf("age");
        System.out.println(index3);
        System.out.println(index4);
        System.out.println("-----------------------");

        String s1 = "WOODEN SPOON";

        s1 = s1.toLowerCase();

        System.out.println(s1);

        System.out.println("-----------------------");

        String sentence =" Today is Thursday and Thursday is a lab day";

       String sentence1= sentence.replace("Thursday","a good day");

        System.out.println(sentence1);

        System.out.println("-------------------------");

        String s = "Today is Thursday and tomorrow is Thursday";

        s= s.replaceFirst("Thursday","Wednesday");
        System.out.println(s);


        System.out.println("--------------------");

        String email = "Cydeo_school@gmail.com";
        int beginningIndex = email.indexOf('@')+1;
        int endingIndex = email.lastIndexOf('.');//the . will not be included as how substring works whatever the closin index is has -1 included in it
        //ending index of substring is always excluded
        String domain =email.substring(beginningIndex,endingIndex);
        System.out.println(domain);

        System.out.println("-----------------");

        String s2 = "I study at CYDEO";

        String schoolname = s2.substring(s2.indexOf('C'));

        System.out.println(schoolname);

        System.out.println("------------------");

        String a1 ="DOG";
        String a2 ="dog";
        System.out.println(a1.equals(a2));
        System.out.println(a1.toLowerCase().equals(a2)); // to make them equal each other as java is case sensitive
        System.out.println(a1.equalsIgnoreCase(a2)); //ignores lower and upper case


        System.out.println("-------------------");

        String s3 ="Java is my favorite programming language";

        System.out.println(s3.equals("Java")); //this will never return true
        System.out.println(s3.contains("Java")); // this will return true

        System.out.println("-----------------------------");

        String w ="Cydeo School";

        System.out.println(w.startsWith("Cyo"));// will return false



    }
}
