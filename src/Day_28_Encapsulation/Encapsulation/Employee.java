package Day_28_Encapsulation.Encapsulation;

public class Employee {
    private double salary;

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary<0){
            System.err.println("invalid salary "+salary);
            System.exit(1);
        }
        this.salary=salary;

    }


}
