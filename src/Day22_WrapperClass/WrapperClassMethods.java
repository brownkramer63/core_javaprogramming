package Day22_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {


        System.out.println("----finish class and write above the line------");


        char ch ='1';

      boolean r1 =  Character.isDigit(ch);

        System.out.println(r1);

       boolean r2= Character.isLetter(ch);
        System.out.println(r2);

        char ch3 = '$';

        boolean chhhh= Character.isLetterOrDigit(ch3);
        System.out.println(chhhh);

        System.out.println("----------------------------------------");

        String string = "A1b2c3d4e5";

        int sum = 0;

        //get every single character and all the numbers add them into sum

        for (char each: string.toCharArray()
             ) {
            if (Character.isDigit(each)){
           sum+= Integer.parseInt(""+each);

            }
        }
        System.out.println(sum); //15


































    }
}
