package Replits.Methods;

import java.util.Scanner;

public class COVERME {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        // your code here
        String answer="";
        if(main.contains(coverME)){

          answer=  main.replace(coverME,"["+coverME+"]");









        }
        else {
           answer="["+main+"]";
        }


return answer;
    }
}
