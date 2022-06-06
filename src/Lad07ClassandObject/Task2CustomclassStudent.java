package Lad07ClassandObject;

public class Task2CustomclassStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isemployeed;
    public boolean ismarried;
    public int batch;
    public String programminglanguage;
    public int groupnumber;

    //sets all fields
    public void setInfo(String name, int age, char gender, boolean isemployeed, boolean ismarried, int batch, String programminglanguage, int groupnumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isemployeed = isemployeed;
        this.ismarried = ismarried;
        this.batch = batch;
        this.programminglanguage = programminglanguage;
        this.groupnumber = groupnumber;
    }


    public void study(){
        System.out.println(name+" is studying "+programminglanguage);
    }

    // displays the student info when the object is passed in print statement
    public String toString() {
        return "Task2CustomclassStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch=" + batch +
                ", programminglanguage='" + programminglanguage + '\'' +
                '}';
    }

    //    1. Create a custom class for CydeoStudent objects.
//1. In each object, user should be able to store the name, age, gender,
//isMarried, isEmployeed, batch, programming language, and group
//number information of the Cydeo student
//2. Add a function named setInfo that allows the user to be able to
//set all the fields of the Cydeo student
//3. Add a function named study that can print the name and
//programming language the student studying
//4. Add a function that allows the user to be able to display each
//objects’ name, age, gender, batch and programming language of
//the student when it’s passed in the print statement
}
