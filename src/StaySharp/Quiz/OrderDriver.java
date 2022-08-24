package StaySharp.Quiz;

public class OrderDriver {

    public static void main(String[] args) {

        Order order = new Order("f");
        order= new Order();


    }

}

class Order2 {

    static String result = "";

    {
        result += "c";
    }

    static {
        result += "u";
    }

    static {
        result += "r";
    }

}


