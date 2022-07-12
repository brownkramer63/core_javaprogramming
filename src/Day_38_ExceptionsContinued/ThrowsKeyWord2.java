package Day_38_ExceptionsContinued;

public class ThrowsKeyWord2 {
    public static void main(String[] args) {

        //method1();
    }

    public static void pausefor5seconds() throws InterruptedException {

        Thread.sleep(5000);


    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pausefor5seconds();
        System.out.println("Hello Cydeo");
    }

}
