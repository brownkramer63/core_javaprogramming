package InterviewPrepQuestions;

import java.util.ArrayList;

public class PalindromeArray {
    public static ArrayList<String> listing(String[] arr){

        ArrayList<String> list = new ArrayList<>();

        for (String each:arr
             ) {
            String comparison ="";
            for (int i = each.length()-1; i >=0 ; i--) {
                comparison+=each.charAt(i)+"";
            }
            if (each.equals(comparison)){
                list.add(each);
            }
        }
        return list;



    }

    public static void main(String[] args) {
        String[] arr= {"abc", "car", "ada", "racecar", "cool"};

        System.out.println(listing(arr));
    }
}
