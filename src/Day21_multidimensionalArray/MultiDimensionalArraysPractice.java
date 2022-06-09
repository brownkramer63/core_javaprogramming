package Day21_multidimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysPractice {
    public static void main(String[] args) {

String[] group1 ={"KRamers","Baha","Marissas"};
String[] group2 ={"KRamerss","Bahas","Marissass"};
String[] group3 ={"KRamersss","Bahasss","Marissasss"};
String[] group4 ={"KRamerssss","Bahass","Marissassert"};

String[][] groups ={group1,group2,group3,group4};

        for (int i = 0; i <groups.length ; i++) {
        String[] eachgroup= groups[i];
            System.out.println(Arrays.toString(eachgroup));

            for (int j = 0; j < eachgroup.length; j++) {
                String eachStudent = eachgroup[j];
                System.out.println(eachStudent);
            }
            }

        System.out.println("---------------------------------");

        System.out.println(Arrays.deepToString(groups));


        }



    }

