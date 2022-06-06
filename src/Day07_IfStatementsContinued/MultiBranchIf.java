package Day07_IfStatementsContinued;

public class MultiBranchIf {
    public static void main(String[] args) {
      int num = 0;

      String result ="";

      if (num> 0){result ="Positive";}
      else if (num <0) {result="Negative";}
      else {result="Zero";}

        System.out.println("Answer is "+result);


    }
}
