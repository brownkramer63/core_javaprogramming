package LabDay13_CollectionMap;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

       // Collection<Integer> collection = new ArrayList<>(); //we couldnt use list methods as we used collection
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(200);
        //since we used collection we cannot use get method
        System.out.println(list.get(0));
        //we can have duplicate elements in the list as we all know
        //cant do this for  the sets

        Set<String> gh = new HashSet<>();
        gh.add("Kramer");
        gh.add("muhtar");
        gh.add("muhtar");
        gh.add("muhtar");
        gh.add("lindsay");

        System.out.println(gh);

        System.out.println("-----------------------");

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "java","jAVA","Python","C#","Ruby"));

        words.removeIf(p -> p.toLowerCase().startsWith("j") && p.toLowerCase().endsWith("a"));

        System.out.println(words);
        //the p is each element in the list look int parse and we use remove if alot

        words.forEach(c -> {
            if (!c.equals("Python"))
            System.out.println(c);
        });













    }
}
