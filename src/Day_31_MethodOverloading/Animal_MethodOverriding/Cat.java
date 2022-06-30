package Day_31_MethodOverloading.Animal_MethodOverriding;

public class Cat extends Animal{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Cat " +getName()+" is eating cat food");
    }


    public void drink() {
        System.out.println("Cat"+getName()+" sometimes spills its water when it drinks");
    }

    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching");
    }
}
