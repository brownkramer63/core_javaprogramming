package Day_31_MethodOverloading.Animal_MethodOverriding;

public class TestAnimalObject {
    public static void main(String[] args) {


    Cat cat = new Cat("Emily","Bengle",'F',3,"Medium","Black");
    Dog dog = new Dog("Max","Pitbull",'M',2,"Large","Brown");
    Lion lion = new Lion("Shakar","Bengal",'M',4,"Large","Orange",true);
    Eagle eagle =new Eagle("Eagle","Eagle",'m',3,"big","White");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-----------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();




            }
            }

