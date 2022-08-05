package StaySharp;

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
    }

    public static boolean solution(String str, String ending) {
        String strend = str.substring( (str.length()-1)-(ending.length()-1),str.length() );
        System.out.println(strend);
        if(strend.equals(ending)){
            return true;
        }else{
            return false;
        }  }
}
