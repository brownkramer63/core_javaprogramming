package day16_nestedloops;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition; ){
            System.out.println("Hello Cydeo --- for loop");
        }

        System.out.println("------------------------");

        while (condition){
            System.out.println("Hello Cydeo ----While Loop");
        }
        System.out.println("--------------------------");

        do {
            System.out.println("Hello Cydeo do while loop");// this statement will be ran even before the condition is checked this is what makes this type of loop different from while loop
        }while (condition);

    }
}
