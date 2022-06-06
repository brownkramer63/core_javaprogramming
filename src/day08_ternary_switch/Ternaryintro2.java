package day08_ternary_switch;

public class Ternaryintro2 {
    public static void main(String[] args) {
        int number = 100;

        /*
        String result ="";
        if(number> 0){result="positive";}
        else if (number < 0) {result="negative";}
        else {result="Zero";}

        System.out.println(result);

        */

        String result = (number>0) ? "Positive" :(number<0)? "Negative" : "Zero";
//                    condition    ?=if  :()?= else if with additional condition ?=else
        System.out.println(result);

        int n = 1;


        String day =(n==1)? "Monday":(n==2)?"Tuesday":(n==3)? "Wednesday": "Thursday";
        System.out.println(day);

        System.out.println("--------------");

        int num=5; //1~12;
        String month= (num==1)?"January":(num==2)?"Feb":(num==3)?"march":"April";
        System.out.println(month);






    }
}
