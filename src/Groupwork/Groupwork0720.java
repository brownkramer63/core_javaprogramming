package Groupwork;

import java.util.Vector;

public class Groupwork0720 {
    public static void main(String[] args) {

        Vector <Integer> vec = new Vector();
        vec.add(10);
        vec.add(10);
        vec.add(20);
        vec.add(20);
        vec.add(20);
//        vec.add("string");
        String str ="10";
        vec.add(Integer.parseInt(str));

        Integer.valueOf(str);


        System.out.println(vec);

        for (Object o : vec) {
            if (o==Integer.valueOf(10)){

                System.out.println(vec);
            }
        }

    }
}
