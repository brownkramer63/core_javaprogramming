package day08_ternary_switch;

public class TernariesIntro {
    public static void main(String[] args) {
        int score = 85;

        String result = "";
        if (score >=60){
            result="passed";
        }else {result="failed";}
            System.out.println(result);
        System.out.println("-------------------");

        String result2 = (score>=60) ? "Passed" : "Failed";
        System.out.println(result2);

        System.out.println("----------------");

        int age =34;

        String r =(age>=21) ? "Eligible" : "Failed";

        System.out.println(r);


    }
}
