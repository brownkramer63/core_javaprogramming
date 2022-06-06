package day05_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // pre increment/ decrement
        int x = 10;
        System.out.println(++x);
        //will give you the number 11
        System.out.println(x);
        // once you run a function that changes the integer it will be changed after
        int y = 100;
        System.out.println(--y);
        // will give you the number 99
        //System.out.println(---------------);
        //post increment/decrement
        int a = 50;
        System.out.println(a++);//does not increase by 1 immediately value is 50
        System.out.println(a);//since we looked to add it after this value is now 51
        int b = 25;
        System.out.println(b--);// does not decrease immediately value is 25
        System.out.println(b);//value is now 24
        System.out.println("-------------------");
        int n = 30;

        int m = n ++; // m =30 , n=31
        System.out.println(m);
        System.out.println(n);

        int z = 60;
        int q = z--; //q=60, z=59
        System.out.println("z = " + z);
        System.out.println("q = " + q);









    }
}
