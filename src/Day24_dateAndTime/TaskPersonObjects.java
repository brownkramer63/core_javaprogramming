package Day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskPersonObjects {
    public static void main(String[] args) {

        Person[] people ={new Person(),new Person(),new Person(),new Person(),new Person()};

        people[0].setInfo("Kramer",'m', LocalDate.of(1997,3,14));
        people[1].setInfo("Marissa",'f', LocalDate.of(1998,2,20));
        people[2].setInfo("Muhtar",'m', LocalDate.of(1985,5,14));
        people[3].setInfo("Entisar",'f', LocalDate.of(1987,7,10));
        people[4].setInfo("Baha",'m', LocalDate.of(1990,6,1));

        ArrayList<Person> peoplelist = new ArrayList<>();
        peoplelist.addAll(Arrays.asList(people));

        System.out.println(peoplelist);

        System.out.println("-----------------------");

        // remove age greater than 31







    }
}
