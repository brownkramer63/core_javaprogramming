package lab12_oop_exceptions.RestraurantTask;

public class NoSuchPersonException extends RuntimeException{

    public NoSuchPersonException(String message) {
        super(message);
    }
}
