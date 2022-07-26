package Replits.Arrays;

import java.util.Scanner;

public class GetDuplicates {
    public static String getDup(String[] r) {
int stringcount = 0;
int finalcount = 0;
        for (String each :r
             ) {
            for (String e :r
                 ) {
                if (each.equals(e)){
                    stringcount++;
                }
            }
           if (stringcount>=2){
               finalcount++;
           }
           stringcount=0;
        }

return finalcount+"";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));
    }  }
