package Day_41_Mapping;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //key is string value is int
        Map<String, Integer> map1 = new HashMap<>(); // random order
        map1.put("Daniel",95000);
        map1.put("Emily",100000);
        map1.put("arron",78000);
        map1.put("Chris",null);

        System.out.println(map1);
        System.out.println("---------------");

        Map<String, Integer> map2 = new LinkedHashMap<>(); // insertion order kept
        map2.put("Daniel",95000);
        map2.put("Emily",100000);
        map2.put("arron",78000);

        System.out.println(map2);
        System.out.println("---------");



        Map<String, Integer> map3 = new TreeMap<>(); // in the sorted order it compares the keys of the map whichever key have smaller value will be first largest will be last
       //does not accept null the other 2 do
        Map<String, Integer> map4 = new Hashtable<>(); // random order, no null, but synchronized one thread/key at a time









    }
}
