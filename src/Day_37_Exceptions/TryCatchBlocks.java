package Day_37_Exceptions;

import java.io.IOException;
import java.util.Locale;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            System.out.println(9/0);
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program ended");

        System.out.println("----------------------");

        System.out.println("Program 2 start");

        String str = null;


        try {
            System.out.println(str.toLowerCase());
            System.out.println("try block");
        }catch (RuntimeException e){

            System.out.println("catch used ");
        }
        System.out.println("Program 2 end ");

        System.out.println("--------------------");

        System.out.println("Program 3 start");

        try {
            Thread.sleep(3000);
            System.out.println("Try block");
        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program 3 endeed ");




    }
}
