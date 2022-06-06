package day08_ternary_switch;

public class ternaryIntro3 {
    public static void main(String[] args) {
        int score =45;

        String result="";
/*
        if(score>=0 && score<=100) {
            if (score >= 60) {
                result = "pass";
            } else {
                result = "Failed";
            }
        }else {
                result = "invalid";
            }

            System.out.println(result);

        System.out.println("----------------");

        String result =(score>=0 && score <=100)? //starting if statement
                (score >=60)? // nested if first statement
                "passed":"failed" //results from this statement
                :"invalid"; //final else statment
        // how it looks all together

        String result =(score>=0 && score <=100)? (score >=60)? "passed":"failed" :"invalid";
*/
        int n =5;

        String day =( n>= 1 && n <=7)?
                (n==1)?"Monday": (n==2)?"Tuesday":(n==3)?"WEdnesday":(n==4)?"thursday":(n==5)?"friday":(n==6)?"saturday":"Sunday"
                :"No such a day";

        System.out.println(day);

    }
}
