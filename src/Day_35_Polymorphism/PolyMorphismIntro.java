package Day_35_Polymorphism;

import Day_34_Abstraction.AnimalTask.*;

public class PolyMorphismIntro {

    public static void main(String[] args) {

      Dog dog=  new Dog("Max","dog",'M',4,"Large","red");
        Cat cat= new Cat("jj","garfield",'F',4,"large","black");

        Tiger tiger= new Tiger("d","d",'M',4,"Large","white");

        Eagle eagle=new Eagle(null,null,'M',2,null,null);

        Lion lion;

        Parrot parrot = null;


        Animal[] animals = {dog,cat,tiger,eagle};

        System.out.println("---------------------");




    }

}
