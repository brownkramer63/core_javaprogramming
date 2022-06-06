package day06_ifStatements;

public class IfStatementsIntro {
    public static void main(String[] args) {
        int number = 0;

       // System.out.println(number + " is positive number");
        // this will just spit out any number that the int number is defined as
        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println(number + " is positive number");
        }
        boolean isNegative = number < 0;

        if (isNegative) {
            System.out.println(number + " is negative number");
        }
        boolean isZero = number==0;
        if (isZero) {
            System.out.println(number + " is zero number");
        }
       // System.out.println(------------------);
        int num = 100;
        if(num > 0){
            System.out.println(num+" is positive number");
        }
        if(num<0){
            System.out.println(num+" is negative number");
        }
        if(num==0){
            System.out.println(num+ " is zero");
        }



















    }
}
