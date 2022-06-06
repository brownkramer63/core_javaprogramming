package day13_methodscontinued;

public class warmuptasksday13 {
    public static void main(String[] args) {


calculate2(45,68,'%');

ageGroup(149);

eligibleToVote(25,false);

    }
    public static void calculate2 (double num1,double num2, char mathOperator){

        double result =0;

        switch(mathOperator){
            case '/':
               result= num1 / num2;
                System.out.println(num1 + " "+mathOperator+" "+num2+" = "+result);
                break;
            case '*':
                result= num1 * num2;
                System.out.println(num1 + " "+mathOperator+" "+num2+" = "+result);
                break;
            case '-':
                result= num1 - num2;
                System.out.println(num1 + " "+mathOperator+" "+num2+" = "+result);
                break;
            case '+':
                result= num1 + num2;
                System.out.println(num1 + " "+mathOperator+" "+num2+" = "+result);
                break;
            case '%':
                result= num1 % num2;
                System.out.println(num1 + " "+mathOperator+" "+num2+" = "+result);
                break;
            default:
                System.out.println("invalid math operator");
        }


}

    public static void ageGroup (int age){
        if(age>=0 && age<= 150){
        if(age<21){
            System.out.println("Teenager");
        } else if (age>=21 && age<55) {
            System.out.println("Adult");

        } else if (age>=55 && age<=150) {
            System.out.println("Senior");

        }} else{
            System.out.println("invalid age");

    }


}


    public static void eligibleToVote (int age, boolean isAmerican){

        if(age>=18 && isAmerican){
            System.out.println("you are eligible to vote");}else {
            System.out.println("you are not eligible to vote poser");

    }}







}





//1. Create a method named calculate that can take three arguments:
//            num1 (double)
//            num2 (double)
//            mathOperator (char)
//
//    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"
//
//        Ex:
//            calculate(10, 20, '+')
//
//        output:
//            10 + 20 = 30


//2. Create a method named ageGroup that can print the age group of the person
//
//        age groups are:
//                Teenager (< 21)
//                Adult   (>=21 && <55 )
//                Senior  ( > 55 )