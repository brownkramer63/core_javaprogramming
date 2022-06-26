package Lab09_ClassAndObjectConstructorEncapsulation.ScrumTask;

public class Tester {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null || name.isEmpty() || name.isBlank()){
            System.err.println("Name must have value, program ended");
            System.exit(1);
        }
        this.name = name;
    }



    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<18){
            System.err.println("invalid age, program ended");
            System.exit(1);
        }
        this.age = age;
    }
    private char gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            System.err.println("invalid gender please select M or F");
            System.exit(1);
        }
        this.gender = gender;
    }



    private String employeeID;
    //we dont do anything with this private


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }





    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle==null || jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title must have value, program ended");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate<0){
            System.err.println("hourly rate cannot be negative, try again");
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    //constructor we are making


    public Tester(String name, int age, char gender, String employeeID, String jobTitle, double hourlyRate) {
        setName(name);
        setAge(age);
        setGender(gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);

    }

    public double getSalary(){
        return hourlyRate*40*52;
    }

    public void testing(){
        System.out.println(name+" is testing the application");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary" + getSalary() +
                '}';
    }
}
