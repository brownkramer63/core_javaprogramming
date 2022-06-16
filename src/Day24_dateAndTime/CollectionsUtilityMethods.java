package Day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();
        languages.addAll(Arrays.asList("Java", "JAva", "Java","C#","Kramer langauge","Objects","Elements"));

        System.out.println(languages);

//        for (int i = 0; i <languages.size() ; i++) {
//
//            if (languages.get(i).equals("Java")){
//                languages.set(i,"new world order");
//            }
//        }

        Collections.replaceAll(languages,"Java","Cydeo 2.0");


        System.out.println(languages);

        System.out.println("----------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,20,30,40,50,50,50,50,60,66,66,76,50));

        int count =Collections.frequency(list,50);

        System.out.println("count = " + count);

        ArrayList<Integer> nummynammy = new ArrayList<>();

        nummynammy.addAll(Arrays.asList(10,20,30,40,50,50,50,50,60,66,66,76,50));

        for (Integer each:nummynammy
             ) {
            if (Collections.frequency(nummynammy,each)==1){
                System.out.println(each);
            }
        }









    }
}
