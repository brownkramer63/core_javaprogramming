package day_29_Inheritance.AnimalTask;

public class Animal {

    public String name;
    public String breed;
    public char gender;
    public String size;
    public String color;
    public int age;
    //these would be better to declare as private


    public static boolean isAnimal =true;
    //just a static we added to show what it would look like

    //static block example this would be better if we had multiple conditions
    static{
        isAnimal=true;
    }

    public void setInfo(String name, String breed, char gender, String size, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
