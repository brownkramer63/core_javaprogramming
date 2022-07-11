package Day_37_Exceptions;

import Day_36_Polymorphism.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('S',2,3);
        Pizza pizza2 = new Pizza('S',2,3);


        System.out.println(pizza1==pizza2  );
        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('S',2,3);

   //    double area= ((Circle)obj).area();//will give error









    }

}
