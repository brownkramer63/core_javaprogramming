package day10_StringIntro;
import java.util.Scanner;
import java.lang.String;

public class StringIntro {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        String str ="Java";

        System.out.println("-------------------");
        input.close();

        System.out.println("-----------------");

        String s1="cat";
        String s2 ="Dog";
        String s3 ="Cat";
        String s4 ="Cat";
        System.out.println("-----------------");

        String str1 =new String("Java");//creates two objects 1. in string pool 2. in heap (outside string)


        String str2 =new String("Java");
        System.out.println(str2==str1);

        System.out.println("----------------");

        String t1 ="Python";
        String t2 = new String("Python");











    }
}
