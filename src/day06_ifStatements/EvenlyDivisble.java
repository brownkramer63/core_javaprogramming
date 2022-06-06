package day06_ifStatements;

public class EvenlyDivisble {
    public static void main(String[] args) {
        int number = 65;

        boolean isDivisbleBy2 = number % 2 == 0;
        boolean isDivisbleBy3 = number % 3 == 0;
        boolean isDivsibleBy5 = number % 5 == 0;

        System.out.println(number+ " is divisible by 2: "+isDivisbleBy2);
        System.out.println(number + " is divisible by 3: "+isDivisbleBy3);
        System.out.println(number + " is divisible by 5: "+ isDivsibleBy5);







    }
}
