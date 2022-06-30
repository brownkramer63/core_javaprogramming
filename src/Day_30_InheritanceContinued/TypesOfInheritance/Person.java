package Day_30_InheritanceContinued.TypesOfInheritance;

import java.time.LocalDateTime;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDateTime DOB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDateTime getDOB() {
        return DOB;
    }

    public void setDOB(LocalDateTime DOB) {
        this.DOB = DOB;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }

    public Person(String name, char gender, LocalDateTime DOB) {
     setName(name);
     setAge(LocalDateTime.now().getYear()-  DOB.getYear());
     setGender(gender);
     setDOB(DOB );



    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }





}
