package Day25_Constructor;

import java.time.LocalDate;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public LocalDate hireDate;


    public Employee(String name, int age,char gender,String jobTitle,LocalDate hireDate){
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.jobTitle=jobTitle;
        this.hireDate=hireDate;



    }
}
