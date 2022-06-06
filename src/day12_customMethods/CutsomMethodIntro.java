package day12_customMethods;

public class CutsomMethodIntro {
    public  static void main(String[] args) {

        System.out.println("test started");
    greetings();
    displayMessage();

        System.out.println("after method we made");

    }
    //cannot have a method inside the main method
    public static void greetings(){

        System.out.println("Hello Cydeo");
        System.out.println("How are you today");
    }

    public static void displayMessage(){
        System.out.println("1 2 3 4 5");
        System.out.println("I love Java");
    }

}
