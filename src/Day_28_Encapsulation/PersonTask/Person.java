package Day_28_Encapsulation.PersonTask;

public class Person {
    public String name; // these are our instance variables
    public int age;
    public char gender;
    public String language;



    public static String planet; // we will set all of these in the static block we will make
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHeads;

    //now we will make our constructor for our instance methods


    public Person(String name) { // every single constructor must have same name as class name
        this.name = name;
    }

    public Person(String name, int age) { // allows us to create person object by setting name and age
        //we are calling the name from the other person constructor method
        this(name);// note that constuctor must be the first thing called cannot add this after this.age below or it wont work
        this.age = age;
//note you can only call one other constructor per a new constructor
    }

    public Person(String name, String language) {
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this(name,age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {
        this(name,age,gender);
        this.language = language;
    }

    static{ // our static block we made
        planet = "Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHeads=1;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is: "+planet);
    }

    public void eat(String food){
        System.out.println(name +" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }


    public String toString() { // to string only includes the instance variables need to manually add static
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' + //static added
                '}';
    }
}
