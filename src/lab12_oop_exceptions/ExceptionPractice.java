package lab12_oop_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {
    public static void main(String[] args) {
        String str = null;


        try {

         String result=   str.repeat(3);
            System.out.println(result);
        }
        catch (RuntimeException e){

           e.printStackTrace(); // gives details of exception
            System.out.println("catch block");
            str="Java";
            String result=   str.repeat(3);
            System.out.println(result);
        }

        System.out.println("---------------------------");

        try {
            new FileInputStream("C:\\Users\\12177\\IdeaProjects\\corejavaprogramming\\src\\lab12_oop_exceptions\\NoSuchAJobException.java");
        }catch (FileNotFoundException e){
            e.printStackTrace();

            System.out.println("cant find the file buddy");
        }











    }
}
