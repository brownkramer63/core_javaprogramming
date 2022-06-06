package Day19_Arrays;
import java.util.Arrays;
public class ArraysPractice1 {
    public static void main(String[] args) {

       String[] group3 = new String[5];

       group3[0]= "baha";
       group3[1]= "Kramer";
       group3[2]= "Entisar";
       group3[3]="nihan";
       group3[group3.length-1]="shukur";

        System.out.println(Arrays.toString(group3)); // even though the data type was string need to convert to String

        System.out.println("------------------------------");

        for (int i = group3.length-1; i >=0 ; i--) {
            System.out.println(group3[i]);
        }

        System.out.println("--------------------------");

//        for (int i = 0; i < group3.length; i++) { to get this group3.fori
//
//        }




    }
}
