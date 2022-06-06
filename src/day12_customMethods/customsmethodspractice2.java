package day12_customMethods;

public class customsmethodspractice2 {
    public static void main(String[] args) {

        maxnumber(4.5,5.6);

        intialsgenerator("kramer","brown");
    }

    //create a method that can print the maximum number between two numbers, if both are equal then it prints equal

    public static void maxnumber (double num1, double num2){
        if( num1>num2){
            System.out.println("number"+num1+" is bigger");} else if (num1<num2) {
            System.out.println("number "+num2+"is bigger");}else {
            System.out.println(num1+" is equal to "+num2);}
        }






    //create a method that an display the intinals of a personfirst and last name
    public static void intialsgenerator (String firstname, String lastname){
        String initial1 = firstname.substring(0,1).toUpperCase();
        String initial2 = lastname.substring(0,1).toUpperCase();
        System.out.println(initial1+"."+initial2);


    }

}
