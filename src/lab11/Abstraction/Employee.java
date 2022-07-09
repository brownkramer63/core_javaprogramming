package lab11.Abstraction;

public abstract class Employee extends Person {
    private final String id;
    private  String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        if (id.equals(null)){
            System.err.println("invalid id");
        }
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {// employee class overridden
        return super.toString().replace("}","") +
        "id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }


}
