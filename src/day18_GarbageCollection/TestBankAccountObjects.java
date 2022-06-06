package day18_GarbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();

        obj1.setInfo("marissa",348245,3245.55);
      obj1.deposit(1000);
      obj1.checkbalance();

      obj1.withdraw(400);

      obj1.checkbalance();

        System.out.println("-------------------");

        BankAccount account1 = new BankAccount();
        account1.setInfo("jack", 458655543,0);

        BankAccount account2 = new BankAccount();

        account2.setInfo("umran", 4847272,0);

        account1.deposit(5000);

        account1.checkbalance();



    }

}