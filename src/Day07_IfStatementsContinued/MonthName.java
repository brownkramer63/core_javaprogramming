package Day07_IfStatementsContinued;

public class MonthName {
    public static void main(String[] args) {
        int number =5;

        String output = "";

        if(number>=1 && number<=12){
        if(number== 1){ output = "January";}
        else if (number==2) {output ="February";}
        else if (number ==3) {output ="March";}
        else if (number ==4) {output = "April";}
        else if (number==5) {output ="May";}
        else if (number ==6) {output ="June";}
        else if (number==7) {output ="July";}
        else if (number ==8) {output ="August";}
        else if (number ==9) {output = "September";}
        else if (number==10) {output ="october";}
        else if (number ==11) {output ="november";}
        else if (number ==12) {output= "December";}
        else {output ="invalid age";}


    }else {output="invalid age";}
        System.out.println(output);
}}
