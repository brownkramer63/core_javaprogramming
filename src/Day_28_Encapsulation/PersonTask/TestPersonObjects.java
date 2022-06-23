package Day_28_Encapsulation.PersonTask;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Kramer");
        Person person2 = new Person("Kramer2",25,'M',"English");
        Person person3 = new Person("Marissa","English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);



    }
}
