package Day_39_Collections.MultiThreading;

public class TestMultiThreads {
    public static void main(String[] args) {

        Thread thread1 = new ThreadHelloWorld();
        Thread thread2 = new ThreadHelloWorld();

        thread1.start();
        thread2.start(); // they will print at the same time



    }
}
