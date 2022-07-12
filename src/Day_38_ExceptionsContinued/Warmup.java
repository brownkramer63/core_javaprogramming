package Day_38_ExceptionsContinued;

public class Warmup {
    public static void main(String[] args) {

        int[] n= new int[]{1, 1, 1, 1, 1, 2, 3};

        System.out.println(fifthelement(n));

    }
    public static int fifthelement(int[] n){

        return n[6];
    }
}
//1. Write a program that can return the fifth element from an array
//
//        note: avoid getting any exceptions