package day05_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);

        a = 40;

        System.out.println(a);

        double balance = 100;

        balance += 1000; // balance = 100+ 1000

        System.out.println(balance);
        balance+=500; // balance will equal 1100 +500
        System.out.println("balance = " + balance);
        System.out.println("-----------");

        balance -= 1000; // previously balance -1000
        System.out.println("balance = " + balance);
        System.out.println("----------");
        double salary = 45000;

        salary *= 2; //salary of 45000*2
        System.out.println("salary = " + salary);

        salary *=3;
        System.out.println("salary = " + salary);

        System.out.println("-------");

        double eth = 50;
        eth /=2;
        System.out.println("eth = " + eth);

        System.out.println("---------");
        
        int b = 39;
         b %= 7; // will calculate the remiander of 35 divided by 7
        System.out.println("b = " + b);
        
        
        
        





    }
}
