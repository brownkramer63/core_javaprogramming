package day11_StringsContinued;


public class Stringmethod1 {
    public static void main(String[] args) {

        String str1 = "Java Programming";

        str1.toLowerCase();//"java programming

        System.out.println(str1);

        String str2 ="kramer programming";

        str2=str2.toUpperCase();

        System.out.println(str2);

        System.out.println("----------------------------");

        String str4 ="               Cyedo School";
        System.out.println(str4);
        str4= str4.trim();
        System.out.println(str4);

        System.out.println("----------------");

        String sentence1= "Today is Sunday, and we have Java Class";

        int index1 =sentence1.indexOf('w');

        System.out.println(index1);

        String s1 ="I Love Java Programming";

        int firstA =s1.indexOf('a');

        System.out.println(firstA);

        System.out.println("-------------------------");

        int secondA= s1.indexOf("a "); //looking for a at end of java

        System.out.println(secondA);


        System.out.println("---------------------");

        String w ="Java";

        System.out.println(w.indexOf('a'));

        System.out.println(w.lastIndexOf('a'));












    }
}
