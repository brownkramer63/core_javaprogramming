package Day_30_InheritanceContinued.TypesOfInheritance;

import java.time.LocalDateTime;

public class Employee extends Person{

    private String jobTitle;
    private String employeeId;
    private String salary;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee(String name, char gender, LocalDateTime DOB, String jobTitle, String employeeId, String salary) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

}
