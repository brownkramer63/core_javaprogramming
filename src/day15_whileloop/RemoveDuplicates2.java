package day15_whileloop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str ="xyxyzxyxz";

        String result ="";

        for (int i = 0; i < str.length(); i++) {

            if(result.contains(""+str.charAt(i))){ // if the character is already contained in new string
                continue; //skip it
            }
            result +=str.charAt(i);

        }  System.out.println(result);

        System.out.println("----------------------");

        int start =0;
        for (int i = 50; i <101 ; i++) {

            if(i%2==0){


            }

        }






    }
}
