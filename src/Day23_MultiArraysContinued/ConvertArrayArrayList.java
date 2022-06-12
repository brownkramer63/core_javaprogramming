package Day23_MultiArraysContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayArrayList {
    public static void main(String[] args) {

        String[] arr ={"Lol","krol","mole"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        // includes the elements of the array
        System.out.println(list);

        System.out.println("-------------------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","c#"));

        String[] languages = list2.toArray(new String[0]);

        System.out.println(Arrays.toString(languages));















    }
}
