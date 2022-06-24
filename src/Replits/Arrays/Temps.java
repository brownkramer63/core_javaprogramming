package Replits.Arrays;

import java.util.Scanner;

public class Temps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps

        // from saim: please update to use a loop to have a different sized arrays

        double answer = 0.0;
        double count = 0.0;
        for (double each: temps
             ) {
            count++;
           answer+= each;
        }
    answer = answer/count;

        System.out.println(answer);


    }
}
