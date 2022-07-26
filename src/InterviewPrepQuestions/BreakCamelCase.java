package InterviewPrepQuestions;

public class BreakCamelCase {


    public static String camelcase(String str){
        String output="";
        for (char each:str.toCharArray()
             ) {
            if (Character.isLowerCase(each)){
                output+=each;
            }else {
                output+=" "+each;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("weLoveProgramming"));
    }
}


//    Write a function that will break up camel casing, using a space between words.
//            Examples
//"camelCasing" => "camel Casing"
//        "weLoveProgramming" => "we Love Programming"
//        "identifier" => "identifier"
//}
