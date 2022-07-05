package Day_34_Abstraction.AnimalTask;

public class Eagle extends Animal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" eats snakes");
    }
}
