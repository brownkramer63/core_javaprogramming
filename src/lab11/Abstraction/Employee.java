package lab11.Abstraction;

public abstract class Employee extends Person {
    private final String id;
    private  String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();



}
