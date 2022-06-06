package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int number= 20;

        boolean isEven = number % 2==0;//when we divide a number by 2, if the remainder is zero it means the number is even

        boolean isOdd = number % 2 !=0; // this will mean the value is odd
        //wicked cool coding here
        //another way to right this would be
        //boolean isOdd = !isEven; //if the number is not even then it is odd
        System.out.println(number + " is an even number: "+ isEven);
        System.out.println(number + " is an odd number: " + isOdd);






    }
}
/*
Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
            Ex:
                number = 20

            output:
                20 is an even number: true
                20 is an odd number: false


        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


    2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
 */