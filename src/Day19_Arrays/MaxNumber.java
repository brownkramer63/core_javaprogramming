package Day19_Arrays;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers ={100,500,200,800,54,12};

        int max =numbers[0];//assumption first number is largest in array

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("max = " + max);

    }
}
