package Day_31_MethodOverloading.Animal_MethodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating something");
    }

    public void roar(){
        System.out.println("Lion "+getName()+" is roaring");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", African lion= " + isAfricanLion + '\'' +
                '}';
    }
}
