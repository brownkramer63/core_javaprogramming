package day10_StringIntro;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) throws IOException {
        Scanner readfile = new Scanner(Path.of("src/day10_StringIntro/MyClassMates"));

        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());

        readfile.close();



    }
}
