package Day19_Arrays;

import java.util.Arrays;

public class ArrayLiteral {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {1,2,3,4,5};


        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        System.out.println("-----------------------------");
//elements such as idk      1         2         3           4          5          6         7
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
// index                     0        1          2          3          4         5         6
        int userselectednum = 1; // user selects number that matches string in array

        System.out.println(days[userselectednum-1]); // -1 because array is 0-6
//What is an element in an array Java?
//Image result for what are elements in java
//Each variable in an Java array is also called an "element".
// Thus, the example shown earlier created an array with space for 10 elements,
// and each element is a variable of type int . Each element in the array has an index (a number).
// You can access each element in the array via its index.Apr 24, 2019

        System.out.println("--------------------------");

        String[] months = {"January", "Feb","March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov","Dec"};

        System.out.println("Arrays.toString(months) = " + Arrays.toString(months));

        int[] numbers2 = new int [100];

        for (int i = months.length - 1; i >= 0; i--) {

            System.out.println(months[i]);
        }



















    }
}
