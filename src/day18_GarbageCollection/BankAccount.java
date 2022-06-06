package day18_GarbageCollection;

public class BankAccount {

    public String accountholder;
    public long accountnumber;
    public double balance;

    public void setInfo(String accountholder, long accountnumber, double balance) {
        this.accountholder = accountholder;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountholder='" + accountholder + '\'' +
                ", accountnumber=" + accountnumber +
                ", balance= $" + balance +
                '}';
    }

    public  void checkbalance(){
        System.out.println("your available balance is: $"+balance);
    }

    public void deposit(double amount){

        if (amount<1){
            System.out.println("insufficinet amount: "+amount);
        return;
        }
        balance+=amount;
    }
    public void withdraw(double amount){

        if (amount>balance){
            System.out.println("insufficient withdraw amount: "+ amount);
        }
        balance-= amount;
    }


}
//2. Create a custom class named BankAccount:
//            Attributes:
//                1. accountHolder
//                2. accountNumber
//                3. balance
//
//            Actions:
//                1. setInfo(): sets the accountHolder and accountNumber attributes
//
//                                2. toString(): displays the full account info
//
//                                3. checkBalance():displays the available balance
//
//                                4. deposit(amount): increases the balance by the specified amount
//
//                            5. withdraw(amount): decreases the balance by the specified amount