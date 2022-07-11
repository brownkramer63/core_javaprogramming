package Day_37_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        System.out.println("Program 1 start");
        int[] arr ={1,2,3,4};
        try {
            System.out.println(arr[1000]);
            System.out.println("try block");
        }catch (RuntimeException e){
          //  e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("catch block");
        }



        System.out.println("Program 1 ended");

        System.out.println("--------------------");

        System.out.println("Program 2 start");

        try {

            System.out.println(9/0);
        }catch (RuntimeException e){

            e.printStackTrace();
            System.out.println("catch block");
        }


        System.out.println("-------------------");
        System.out.println("program 3");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }


    }
}
