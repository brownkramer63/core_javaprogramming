package Day25_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("E/y");// look at notes day24 to see options to use

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));



    }
}
