package day13_methodscontinued;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        int num = 200;

        if (iseven(num)) {
            System.out.println("is even number");
        } else {
            System.out.println("is odd number");
        }
    }
public static boolean isodd(int num){
//return (num % 2 !=0)? true: false;
if(num%2 !=0){return true;}else {return false;}

}

public static boolean iseven(int num){

        return !isodd(num);


}

public static int maxnumber(int num1,int num2) {

    if (num1 > num2) {
        return num1;
    } else {
        return num2;
    }
}





}
/*
create a method named is odd that can return true if a number is an odd number

create a method named is even that can return true if a number is an even number

creat a method named max that can return the maximum number

create a method named min that can return the min number
 */