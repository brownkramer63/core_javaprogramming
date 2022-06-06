package day10_StringIntro;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner readfile= new Scanner(Path.of("src/day10_StringIntro/Test.txt"));

        System.out.println(readfile.nextLine());
        System.out.println(readfile.nextLine());// it will continue to read these line by line in the text file
        //so if i wrote a third line it would read it if i add another print statement

        readfile.close();







    }
}
