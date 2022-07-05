package Day_34_Abstraction.AnimalTask;

public class Dog extends Animal implements Playable {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println(getName()+" Is eating");
    }

    @Override
    public void playable() {
        System.out.println("Dog "+getName()+" can play" );}
}
