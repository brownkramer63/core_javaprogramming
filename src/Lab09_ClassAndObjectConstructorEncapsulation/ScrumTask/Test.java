package Lab09_ClassAndObjectConstructorEncapsulation.ScrumTask;

public class Test {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Kramer",25,'M',"4565","Junior Developer",35);


        System.out.println(tester1);


        Developer developer1 = new Developer("Marissa",24,'F',"5thy","Marketing",28,"Python");

        System.out.println(developer1);

    }
}


