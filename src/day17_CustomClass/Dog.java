package day17_CustomClass;

public class Dog {

    public String name; // instance variable
    public String breed;
    public char gender;
    public int age;
    public String size;


    public String color;

    public void setInfo (String name, String breed,char gender,int age ,String size,  String color ){
        this.name =name;
        this.breed= breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color= color;

    }


    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void drink(){
        System.out.println(name+ " is drinking water");
    }

    public String toString() { // to avoid getting hashcodes when we print the class object
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }





}
