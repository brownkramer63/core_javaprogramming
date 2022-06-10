package Day22_WrapperClass;

import Utilities.ArraysUtilitycustom;

public class Test {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,45,60};

       boolean has25= ArraysUtilitycustom.contains(numbers,25);

        System.out.println(" has 25 in array "+ has25);

        System.out.println("-----------------------");

        String[] students = {"Kramer", "Baha","Entisar","Muhtar"};

        boolean haskramer = ArraysUtilitycustom.contains(students,"Kramer");

        System.out.println("does array have kramer "+haskramer);



    }
}
