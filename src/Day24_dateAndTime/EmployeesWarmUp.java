package Day24_dateAndTime;

import day17_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesWarmUp {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        for (Employee people:employees
             ) {
            System.out.println(people.name + " "+people.jobTitle);

        }
        System.out.println("-----------------------");
        for (Employee developers:employees
             ) {
            if (developers.jobTitle.contains("Java Developer")){
                System.out.println(developers.name);
            }
        }

        System.out.println("-----------------------");

        //min max salary

        double max = employees.get(0).salary;//assuming the first employee has biggest salary

        for (Employee each:employees
             ) {
            if (each.salary> max){
                max= each.salary;
            }
        }
        System.out.println(max);

        double min = employees.get(0).salary;
        for (Employee each:employees
        ) {
            if (each.salary< min){
                min= each.salary;
            }
        }
        System.out.println(min);

        System.out.println("---------------------------------------");

        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee empployeegender:employees
             ) {
            if (empployeegender.gender=='M'){
                maleEmployees.add(empployeegender);
            }else {
                femaleEmployees.add(empployeegender);
            }
        }

        System.out.println(femaleEmployees.size());
        System.out.println(maleEmployees.size());
    }


}
