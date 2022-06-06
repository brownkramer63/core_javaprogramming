package day05_Operators;

public class LogicalOperators
{
    public static void main(String[] args) {
        //this is an example if someone could qualify for a loan
        double salary =85000;
        int creditScore= 500;

        boolean eligibleForLoan = salary>=30000 || creditScore >= 650;

        System.out.println(eligibleForLoan);

        System.out.println("----------");
        int age = 32;
        String country = "China";

        boolean eligibleToVote = age >= 18 || country == "USA";

        System.out.println(eligibleToVote);

        System.out.println("--------------------");
        //how to find native english speaker
        country ="Australia";

        boolean nativeEnglishSpeaker = country == "Canada" || country=="USA" || country== "UK" || country =="Australia";
        //                                false            || false          || false          || true
        System.out.println(nativeEnglishSpeaker);

        System.out.println("------------------");











    }
}
