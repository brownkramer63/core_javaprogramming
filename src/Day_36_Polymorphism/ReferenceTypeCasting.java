package Day_36_Polymorphism;

import Day_30_InheritanceContinued.Nokia;
import Day_30_InheritanceContinued.Phone;
import day_29_Inheritance.AnimalTask.Animal;
import day_29_Inheritance.AnimalTask.Cat;
import day_29_Inheritance.AnimalTask.Dog;
import day_29_Inheritance.AnimalTask.Tiger;
import lab11.Abstraction.Developer;
import lab11.Abstraction.Employee;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

      //  Dog dog = new Dog();
       Animal animal = new Dog(); //implicit casting

       Animal animal1 = new Dog();

       animal1.setInfo("max","pitbull",'M',"Large","brown",2);

       animal1.eat();
       animal1.drink();
       animal1.sleep();

        ((Dog)animal1).bark();

        Dog dog1= (Dog)animal1;
        dog1.bark(); // still using animal1 which is the same object

        //((Cat)animal1).scratch();// this will not run as object is a dog and the IS A relationship determines what happens

        System.out.println("-------------");

        Phone phone = new Nokia("Nokia","Brick","Large",400,"White");

        phone.text(12344453);

        Employee employee = new Developer("Lucy",33,'F',"4544","Developer",34);

        employee.work();

      //  System.out.println(((Developer)employee).getProgramingLanguage()); idk if i have this method

        




    }
}
