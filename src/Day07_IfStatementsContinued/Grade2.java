package Day07_IfStatementsContinued;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'A';
        String result ="";

        if(grade=='A'){result = "excellent";}
        else if (grade=='B') {result = "great job";}
        else if (grade=='C') {result = "good";}
        else if (grade == 'D') {result = "Pass";}
        else {result = "fail";}

        System.out.println("Your grade is "+ result);
    }
}
