package Day_40_CollectionsContinued;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> namess = new ArrayList<>();

        namess.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        Iterator<String> it = namess.iterator();

        while (it.hasNext()){
            String each = it.next();
            String reverse="";

            for (int i = each.length()-1; i>=0; i--){
                reverse+= each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }

        System.out.println(namess);

        System.out.println("-----------");

        List<String> names = new ArrayList<>();

        names.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        names.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));

        System.out.println(names);
    }
}
