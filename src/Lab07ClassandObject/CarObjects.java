package Lab07ClassandObject;


public class CarObjects {
    public static void main(String[] args) {

        Task1Car car1= new Task1Car();

        car1.Brand ="BMW";
        car1.Year=1997;
        car1.Model= "xx9";
        car1.color="black";
        car1.Price=5000;

        System.out.println(car1);

    Task1Car car2 = new Task1Car();

    car2.Brand ="Audi";
    car2.Year = 2008;
    car2.Model= "fake tesla";
    car2.color="Mustard";
    car2.Price= 12000;


    Task1Car car3 = new Task1Car();

    car3.setInfo("wookie",2012,"solo","brown",120000);

        System.out.println(car3);
        System.out.println(car2);
        car1.drive();
        car2.drive();


    }
}
