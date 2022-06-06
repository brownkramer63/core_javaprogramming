package lab01;

public class OrdinaryTask {
    public static void main(String[] args) {
        double rate = .5;
        double delta = 200;
      //  int result = rate * rate +delta ; // (rate*rate)+ delta
        int result = (int)(rate * rate +delta) ; //explicit casting forcing java to use integer instead of double
        System.out.println(result);

        int salary = 50000;
        int bonus = 5000;
        double result1 = 2 *(salary+bonus);

        int time = 50;
        int mass = 100;
        double result2 = 1/(time + 3*mass);
        System.out.println(result2);









    }
}
