package day09_ScannerClass;
import java.util.Scanner;

public class ScannerOddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a number");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("number is even");}else {
            System.out.println("number is odd");}








    }
}
