package Day_37_Exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {

        String str = "Java";
        //char ch= str.charAt(250);
        //we have a bug here at there is no index 250

        //System.out.println(ch);

        Pizza pizza=null;//null is not an object so pizza obj does not exist

        //pizza.calcCost();//this wont run as object does not exist

        System.out.println( 50/0 ); // cannot divide things by zero, this is an unchecked exception

        System.out.println("Hello world");


        System.out.println("---------------------");

        int score = 100;

      //  Thread.sleep(3000);//checked exception





    }
}
