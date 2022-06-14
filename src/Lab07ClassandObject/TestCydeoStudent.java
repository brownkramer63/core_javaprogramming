package Lab07ClassandObject;

public class TestCydeoStudent {
    public static void main(String[] args) {



    Task2CustomclassStudent student1 = new Task2CustomclassStudent();

    student1.setInfo("kramer",25,'m',true,false,0,"Java",3);

        System.out.println(student1);// wont display group as it wasnt included in to string

        Task2CustomclassStudent student2 = new Task2CustomclassStudent();

        student2.setInfo("Vasyl",30,'M',true,true,0,"Java",2);

        System.out.println(student2);









    }
}
