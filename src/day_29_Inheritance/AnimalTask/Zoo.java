package day_29_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max","pitbull",'M',"Large","brown",2);
        Cat cat = new Cat();
        cat.setInfo("Meowmeow","mutt",'F',"small","Black",1);
        Tiger tiger = new Tiger();
        tiger.setInfo("Mullock","Siberian",'M',"Huge","Orange and black",5);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-----------------------------");

       dog.eat();
       dog.sleep();
       dog.drink();

       cat.eat();
       cat.sleep();
       cat.meow();

       tiger.eat();
       tiger.sleep();

        System.out.println("-------------------------");

        dog.bark();
        tiger.hunt();















    }
}
