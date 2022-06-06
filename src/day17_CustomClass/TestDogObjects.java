package day17_CustomClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1= new Dog();
    dog1.name ="Max";
    dog1.breed="Husky";
    dog1.gender='M';
    dog1.age=4;
    dog1.size= "large";
    dog1.color = "black";

    dog1.eat();



        Dog dog2 = new Dog();

        dog2.name ="kenai";
        dog2.breed="pitbull";
        dog2.gender='F';
        dog2.age=2;
        dog2.size="medium";
        dog2.color="brown";

        Dog dog3 = new Dog();
        dog3.setInfo("krakra","lab","big",'m',4,"brown");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

    }
}
