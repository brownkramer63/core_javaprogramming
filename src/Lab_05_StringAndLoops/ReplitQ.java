package Lab_05_StringAndLoops;

public class ReplitQ {
    public static void main(String[] args) {

        String s = "Cat Cat Cat Dog Dog Dog";

        int countCat = 0;


        for (int i = 0; i <= s.length() - 3; i++) {// we put -4 here to not get an error when we run loop
            String each = s.substring(i, i + 3);//to count the characters in groups of 4
            System.out.println(each);
            if (each.equals("Cat")) {
                countCat++;
            }
        }
        System.out.println(countCat);


    }}

