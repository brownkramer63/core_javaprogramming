package StaySharp.Quiz;

public class Order {

    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order() {
        value += "b";
    }

    public Order(String str) {
        this();
        value += str;
    }

}

