package Day07_IfStatementsContinued;

public class GradeReport {
    public static void main(String[] args) {
        int grade =70;
        String result = "";

        boolean A = grade >=90;
        boolean B = grade >= 80 && grade <= 89;
        boolean C = grade >=70 && grade <=79;
        boolean D = grade >=60 & grade <=69;
        boolean F = grade >= 50 && grade <=59;

        if( A){result ="your grade is A";}
        else if (B){result = "your grade is B";}
        else if (C){result = "your grade is C";}
        else if(D){result = "your grade is D";}
        else  {result = "Failed";}

        System.out.println(result);





    }
}
