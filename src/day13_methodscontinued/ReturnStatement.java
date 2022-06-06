package day13_methodscontinued;

public class ReturnStatement {
    public static void main(String[] args) {
      eligible(569);


        System.out.println(multiplication(6,6));
    }

    public static void eligible(int age){

        if(age<0 || age>=150){
            System.out.println("invalid age: "+age);
        return; //exits the mehtod
        }
        if(age>=21){
            System.out.println("you are eligiable to buy alcohol");}else {
            System.out.println("you cannot buy alcohol");
        }
    }


    public static int multiplication (int num1, int num2){

       int result =num1*num2;
       return result;


    }


}
