package Day_41_Mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Object> person1 = new LinkedHashMap<>();

        person1.put("name","Arthur");
        person1.put("gender","Male");
        person1.put("age",32);
        person1.put("job title","Developer");
        person1.put("salary",90000);
        person1.put("married",true);

        System.out.println(person1);

        System.out.println(person1.get("age"));




    }
}
