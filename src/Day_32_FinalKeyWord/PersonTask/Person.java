package Day_32_FinalKeyWord.PersonTask;

import java.time.LocalDate;

public class Person {
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate DOB;

    private static final int numberofHead;
    //methods eat drink sleep
    static{
        numberofHead=1;


    }

    public Person(String name, char gender, int age, LocalDate DOB) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setName(String name) {
        this.name = name;
    }
}
