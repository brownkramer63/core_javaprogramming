package Day_28_Encapsulation.Encapsulation;

public class Test {


    public static void main(String[] args) {
        Student student = new Student();
//when we use encapsulation we can set parameters for the age
        //such as a min age


        student.setAge(25);

        System.out.println(student.getAge());

        student.setName("kramer");
        System.out.println(student.getName());
    }
}
