package lab11.Abstraction;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println("blah blah blah");
    }

    public void dailyStandUp(){

    }

    public void workFromHome(){

    }

    @Override
    public void work() {
        System.out.println(getName()+"Is testing the application");
    }
}
