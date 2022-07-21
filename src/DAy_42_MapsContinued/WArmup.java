package DAy_42_MapsContinued;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class WArmup {
    public static void main(String[] args) {


       String str = "bbcccaaaaa";

       Map<String, Integer> map = new LinkedHashMap<>();


        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            map.put(each,frequency);
        }
        System.out.println(map);



    }}
//1. Write a program that can return the frequency of characters
//    Not: MUST use map
//
//    Ex: str = "bbcccaaaaa"
//
//    output:
//    {b=2, c=3, a=5}
//
//2. Write a program that can find the unique characters from a String
//    Not: MUST use map
//    Ex:
//    str = "aabcccdeeeef";
//
//    output:
//    {b=1, d=1, f=1}









