package InterviewPrepQuestions;

public class Palindrome {
    public static boolean palindromecheck(String str){
        str=str.replace(" ","");
        str=str.toLowerCase();

        String comparison ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            comparison+=str.charAt(i)+"";
        }
        if (str.equals(comparison)){
            return true;
        }
        return false;
        }




    public static void main(String[] args) {
        System.out.println(palindromecheck("Race car"));
    }
}
