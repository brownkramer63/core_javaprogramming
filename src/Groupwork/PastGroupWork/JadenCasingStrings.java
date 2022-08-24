package Groupwork.PastGroupWork;

import java.util.Scanner;

public class JadenCasingStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String quote = input.nextLine();


        System.out.println(toJaden(quote));

    }
public static String toJaden(String quote){
      if (quote ==null || quote.isEmpty()){
          return "";
      }
      String ressult = "";

      String [] strings =quote.split(" ");
    for (String typhus:strings
         ) {
        ressult +=(typhus.charAt(0)+"").toUpperCase() +typhus.substring(1)+" ";
    }
return ressult.trim();
}

}