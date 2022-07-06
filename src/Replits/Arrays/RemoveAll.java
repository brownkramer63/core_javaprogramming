package Replits.Arrays;
import java.util.*;
public class RemoveAll {
    //create your method below
    public static ArrayList<String> removeAll(ArrayList<String> wordList,String targetWord){
        ArrayList<String> list1 = new ArrayList<>();

        for(String each: wordList){

            if(!each.contains(targetWord)){
                list1.add(each);
            }


        }
        return list1;


    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }
}
