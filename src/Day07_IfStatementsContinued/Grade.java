package Day07_IfStatementsContinued;

public class Grade {
    public static void main(String[] args) {
        char grade = 60;

        String result = "";

       boolean A = grade >=90;
       boolean B = grade >= 80 && grade <= 89;
       boolean C = grade >=70 && grade <=79;
       boolean D = grade >=60 & grade <=69;
       boolean F = grade >= 50 && grade <=59;

       if( A){result ="excellent";}
       if (B){result = "Great Job";}
       if (C){result = "Good";}
       if (D){result = "Passed";}
       if (F){result = "Failed";}

        System.out.println(result);




/*
 Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */

    }
}
