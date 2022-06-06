package Day07_IfStatementsContinued;

public class LoanApplication {
    public static void main(String[] args) {
        int salary = 50000;
        int creditscore = 700;
        boolean check1 = salary >=45000;
        boolean check2 = creditscore >=700;
        if (check1 && check2) {
            System.out.println("is eligible for loan");
        }
            else{
                System.out.println("is not eligible for loan");
            }










    }
}
