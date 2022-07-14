package lab12_oop_exceptions.RestraurantTask;

public class NoSuchJobException extends RuntimeException{

public NoSuchJobException(String exceptionMsg){
    super(exceptionMsg);//displays the specified message as an exception message
}

    public static void main(String[] args) {
      //  throw new RuntimeException("Something went wrong");

        throw new NoSuchJobException("No such job exists");

    }
}
