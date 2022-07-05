package Day_34_Abstraction.AnimalTask;

public class Duck extends Animal{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eats them bugs buddy");
    }
}
