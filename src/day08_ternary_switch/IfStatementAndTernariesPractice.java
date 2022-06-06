package day08_ternary_switch;

public class IfStatementAndTernariesPractice {
    public static void main(String[] args) {
        int score= 80;

        String result = "";

        if(score>= 0 && score <= 100){
            result= (score>=90)? "A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"fail";



        }else{result= "invalid score";}
        System.out.println(result);









    }
}
