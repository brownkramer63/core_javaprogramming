package Day27_StaticsContinued;

public class TestNestedClassObjects {
    public static void main(String[] args) {
        Car obj1 = new Car(); // car object we are creating

       Car.CarEngine obj2= obj1.new CarEngine();// carengine object first we needed car object which is our outer class
        // then we needed our inner class which is our carengine, inner class can be static

       Car.StaticInnerClass obj3= new Car.StaticInnerClass(); // we can create this inner class without outer class beacuse it is static

    }
}
