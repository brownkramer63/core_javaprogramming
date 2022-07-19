package DAy_42_MapsContinued;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();

        Map<String, Object> person4 = new LinkedHashMap<>();

        Map<String, Object> person5 = new LinkedHashMap<>();

        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person2);

        //  listOfMaps.addAll(Arrays.asList(person3, person4, person5 ) );

        System.out.println(listOfMaps);

        System.out.println("---------------------------------------------------");

        for( Map<String, Object> eachMap  :  listOfMaps ){
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }


        System.out.println("---------------------------------------------------");

        // display the names of the employee who are hired this year (2022)


        for (Map< String, Object> eachMap: listOfMaps){
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()){
                if (eachEntry.getKey().equals("hired_date")){
                    System.out.println(eachEntry.getValue());
                }
            }
        }


        System.out.println("------------------");

        System.out.println(listOfMaps);

        listOfMaps.get(0).replace("name","Arthur","Kramer");

        System.out.println("----------------------");

        System.out.println(listOfMaps);


    }

}
