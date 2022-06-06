package day14_methodsAndLoops;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        System.out.println(sum(5,5,7));
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static int sum (int num1, int num2,int num3){
        return num1+num2+num3;
    }

    public static int sum ( int num1 , int num2 , int num3, int num4){
        return num1+num2+num3+num4;
    }

    public static double sum (double num1, double num2){

        return num1+num2;
    }

    public static double sum (double num1, double num2, double num3){
        return num1+num2+num3;
    }


}
