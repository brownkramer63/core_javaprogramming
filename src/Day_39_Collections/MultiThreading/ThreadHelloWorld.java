package Day_39_Collections.MultiThreading;

public class ThreadHelloWorld extends Thread {




    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World "+i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }




}
