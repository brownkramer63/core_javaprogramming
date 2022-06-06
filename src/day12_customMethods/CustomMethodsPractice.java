package day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        legalage(23);

        oddevenorzero(0);

        gradecalculator(76.03);

    }

    public static void legalage (int age) {

        if (age >= 21) {
            System.out.println("is able to buy alcohol");
        } else {
            System.out.println("is not able to buy alcohol");
        }

    }

    //create a method that can check if a number is odd or even or zero

    public static void oddevenorzero (int number){
        if(number>0){
            System.out.println("is even");} else if (number<0) {
            System.out.println("is odd");}else {
            System.out.println("number is zero");

        }
    }



    //create a method that can calculate the grade of a student

    public static void gradecalculator (double score){
        if(score>=90.00){
            System.out.println("grade is an A");} else if (score<=89.00 && score>=80.00) {
            System.out.println("grade is a B");} else if (score<=79.00 && score>=70.00) {
            System.out.println("grade is a C");} else if (score<=69.00 && score<=60.00) {
            System.out.println("grade is a D");}else{
            System.out.println("student has failed lol");}

        }

    }






