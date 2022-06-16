package Day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());

        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(1997,03,14);

        System.out.println(birthday);


        int instance =LocalDate.now().getYear();

        System.out.println("instance = " + instance);

        System.out.println(today.getDayOfYear());

        System.out.println("----------------------------------------");

        today.plusYears(1);

        System.out.println(today); // today is immutable so the plus will create a new object

        today = today.plusYears(1);// reassign value

        System.out.println(today);// will give us new date

        System.out.println("---------------------------");

        LocalDate graduationDate = LocalDate.of(2025,06,04);

        graduationDate.plusYears(2);

        System.out.println(graduationDate);

        LocalDate newgradDate =   graduationDate.plusYears(2);

        System.out.println(newgradDate);

        System.out.println("--------------------------------");

        LocalDate yourBirthDay =LocalDate.of(2005,04,01);

       LocalDate borthersbday= yourBirthDay.minusYears(2);
        System.out.println(borthersbday);








    }
}
