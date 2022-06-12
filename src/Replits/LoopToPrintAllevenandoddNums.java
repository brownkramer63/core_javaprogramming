package Replits;

public class LoopToPrintAllevenandoddNums {
    public static void main(String[] args) {
        String line1 = "";
        String line2 = "";

        String line11 = null;
        String line22 = null;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                line1 = line1 + (i + " ");
            }
            if (i % 2 == 1) {
                line2 = line2 + (i + " ");
            }
        }
        System.out.println(line1);
        System.out.println(line2);


    }
}
