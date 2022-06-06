package day11_StringsContinued;

public class StringMethods3 {
    public static void main(String[] args) {

        String wert ="";
        boolean wert2 =wert.isEmpty();
        System.out.println(wert2);

        System.out.println("------------------");

        boolean wert3 = wert.isBlank();
        System.out.println(wert3);

        System.out.println("-------------------");

        String str1 ="Cydeo";

        String str2 = new String("Cydeo");

        boolean strstr = str1.equals(str2);

        System.out.println(strstr);

        System.out.println("----------------");

        String students = " hasan Naran Sumeye Natalia";

        boolean hasahmed = students.contains("ahmed");

        System.out.println(hasahmed);









    }
}
