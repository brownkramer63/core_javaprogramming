package day16_nestedloops;

public class NestedForLoop {
    public static void main(String[] args) {

        String str = "AAABBBBBBCCDDEEEE";

        String result = "";// DD want chracters that appear twice

        for (int j = 0; j <str.length() ; j++) {

            char ch = str.charAt(j);
            int count =0;

            for (int i = 0; i < str.length() ; i++) {
                if (str.charAt(i) == ch){
                    count++;
                }
            }
            if (count==2 && !result.contains(""+ch)){ // only characters that appear twice will be added to result
                result+=ch;
            }
        }
        System.out.println(result);



    }
}
