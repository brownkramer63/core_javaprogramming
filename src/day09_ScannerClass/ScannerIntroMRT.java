package day09_ScannerClass;
import java.util.Scanner;
public class ScannerIntroMRT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your name");

        String marissa = input.next();

        System.out.println(marissa+" is kramer's favorite");

        System.out.println("what is your favorite color?");

        String color = input.next();

        System.out.println("I know your favorite color is "+ color);

        input.close();








    }
}
