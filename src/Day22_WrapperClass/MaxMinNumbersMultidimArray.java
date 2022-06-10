package Day22_WrapperClass;

public class MaxMinNumbersMultidimArray {
    public static void main(String[] args) {

int [][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

int max = array[0][0];
int min= array[0][0];

        for (int[] each1d :array ) { //will iterate each 1d array out of the 2d array

            for (int eachelement : each1d) {// wil iterate each element from the 1d array

                if (eachelement> max){
                    max = eachelement;
                }
                if (eachelement<min){
                    min=eachelement;
                }
            }

        }
        System.out.println("Max number is "+max); // make sure both of these are in seperate if statements
        System.out.println("min number is "+min);// otherwise they will cancel each other out



    }
}
//2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
//        Ex:
//            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };
//
//            output:
//                Minimum number is: -200
//                Maximum number is: 1000