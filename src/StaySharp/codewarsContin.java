package StaySharp;

public class codewarsContin {
    public static void main(String[] args) {

        System.out.println(doubleChar("kramer"));
    }

    public static String doubleChar(String str) {
        String s ="";
        for(int i=0; i<str.length(); i++){

            String f=str.charAt(i)+""+str.charAt(i)+"";
            s=s+f;

        }
return s;
    }

}
