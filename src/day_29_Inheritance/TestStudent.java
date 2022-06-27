package day_29_Inheritance;

public class TestStudent {
    public static void main(String[] args) {


        Student student1 = new Student("Kramer", 25, 'M', 'B', "Cydeo");
        System.out.println(student1);

        student1.setSchoolName("La Crosse");
        student1.setGrade('C');
        System.out.println(student1);


    }
}