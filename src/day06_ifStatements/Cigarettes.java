package day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {
        int age = 20;
        if( age> 21 && age<100){
            System.out.println("you are eligible to buy cigarettes");
        }
        if(age<21 || age>100){
            System.out.println("you are not eligible to buy cigarettes");
        }








    }
}
