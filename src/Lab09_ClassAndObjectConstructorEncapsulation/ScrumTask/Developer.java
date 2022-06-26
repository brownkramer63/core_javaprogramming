package Lab09_ClassAndObjectConstructorEncapsulation.ScrumTask;

public class Developer {
    private String name;
    private int age;
    private char gender;
    private String employeeID;
    private String jobTitle;
    private double hourlyRate;
    private String programmingLanguage;


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
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if (!(programmingLanguage=="Java" || programmingLanguage=="JavaSCript" || programmingLanguage=="Python" || programmingLanguage=="Ruby" || programmingLanguage=="C#" || programmingLanguage=="Swift" )){
            System.err.println("need a valid programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int age, char gender, String employeeID, String jobTitle, double hourlyRate,String programmingLanguage) {
        setName(name);
        setAge(age);
        setGender(gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
        setProgrammingLanguage(programmingLanguage);

    }
    public double getSalary(){
        return hourlyRate*40*52;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary" + getSalary() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding with "+programmingLanguage);
    }

    public void fixingbug(){
        System.out.println(name+"  is fixing bug ");
    }







}
