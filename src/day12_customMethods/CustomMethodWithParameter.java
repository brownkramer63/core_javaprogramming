package day12_customMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

        parameteroddoreven(7);

    }
    public static void parameteroddoreven(int number){

        if(number%2==0){
            System.out.println("is even");}else {
            System.out.println("is odd");}


    }
//creat a method that can check is a person is eligible to buy alcohol

    public static void legalage (int age) {

        if (age >= 21) {
            System.out.println("is able to buy alcohol");
        } else {
            System.out.println("is not able to buy alcohol");
        }

    }

    //create a method that can check if a number is odd or even or zero

  //  public static void oddevenorzero ()



    //create a method that can calculate the grade of a student
}
