package lab01;

public class CoinChange {
    public static void main(String[] args) {
        int priceInCents = 40;
        int change = 100-priceInCents; //35 - > 1 quarter 1 dime =25 +10

        int quarter = change / 25; // 40 -> 1 quarter
        int dimes =  (change%25)/10; // 10; 15 -> dime
        int nickles = ((change%25)%10)/5; // 5 -> 1 nickle





        System.out.println("quarter:"+ quarter + "\ndimes:"+ dimes + "\nnickles:"+ nickles);






    }
}
