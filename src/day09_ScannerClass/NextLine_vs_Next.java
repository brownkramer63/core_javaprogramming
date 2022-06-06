package day09_ScannerClass;
import java.util.Scanner;
public class NextLine_vs_Next {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);// the first enter key will go here

        System.out.println(":Enter your age: ");
        int age = input.nextInt(); //25+ enter key

        input.hasNextLine();//we add this so it will let us run the fullname scanner cause it will take the first enter answer

        System.out.println("Enter your full name");
        String fullname= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);// what is happening when the code is run is that the first enter key is being ran
        //by scanner causing it to not let us type an answer





    }
}
