package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int n = 10;
        boolean has28Days = n==2;
        boolean has30Days = n == 4 || n==6 || n==9 || n==11;
        boolean has31Days = !has28Days && !has30Days;//if month does not have 28 days and also does not have 30 days
        String result ="";
        if(has28Days){
            result ="28 days";
        }
        if(has30Days){
            result = "30 days";
        }
        if(has31Days){
            result = "31 days";
        }
        System.out.println(result);




    }
}
