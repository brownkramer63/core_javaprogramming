package Day_32_FinalKeyWord;

import java.time.LocalDate;



class CydeoStudent{


    public final void language(){
        System.out.println("Java programming");
    }

}




public class FinalKeyWord extends CydeoStudent{



    public static void main(String[] args) {

         final char gender='M';

        System.out.println(gender);

        //gender='F';

        System.out.println(gender); //

        System.out.println("----------");

        final LocalDate DOB = LocalDate.now();

        System.out.println(DOB);


new FinalKeyWord().language();







    }



}
