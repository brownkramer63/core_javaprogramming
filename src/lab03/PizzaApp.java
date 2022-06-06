package lab03;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        makeOrder(login());
        // needs to return email address
        // create 3 variables named email(string), account number (int), and password(string) and assign values
        //you can login with email and password or account number and password








    }//end of main method

    public static boolean isdomainvalid(String useremail) {
        //check domain // only gmail and hotmail domain
        String domain = useremail.substring(useremail.indexOf('@')+1,useremail.indexOf('.'));    //gmail or hotmail

        boolean checkdomain= domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        return checkdomain;


    }

    public static boolean isInputvalid(String useremail) {

        int firstsignofindex = useremail.indexOf('@');
        int secondsignofindex = useremail.indexOf('.');

        boolean checkemail = secondsignofindex<firstsignofindex || firstsignofindex<0 || secondsignofindex<0;

        return checkemail;

    }
    public static boolean isInputvalid(int an){
        boolean checkaccountnumber = an >= 100 && an < 1000;
        return checkaccountnumber;
    }

public static String login(){ String email1 = "brownkramer63@gmail.com";
    int accountnum1 = 690;
    String password1 = "munchmunchman69";

    //Ask customer if he.she wants to login with email (1) or account number(2)

    Scanner input = new Scanner(System.in);



    System.out.println("Would you like to login with email (press 1) or account number(press 2)");

    int loginchoice = input.nextInt();

    for (int i = 3; i >0 ;) {

        // this will creat an infinite loop
        // create the selection flow for the login type

        switch (loginchoice) {

            case 1:
                //enter your email
                System.out.println("Please enter email login");
                String useremail = input.next();

                //check if email address is valid: //if @. available and @ is before .

                int firstsignofindex = useremail.indexOf('@');
                int secondsignofindex = useremail.indexOf('.');

                boolean checkemail = secondsignofindex < firstsignofindex || firstsignofindex < 0 || secondsignofindex < 0;

                if (checkemail) {
                    System.out.println("invalid email address");
                    continue;
                }


                if (isInputvalid(useremail) || !isdomainvalid(useremail)) {
                    System.out.println("invalid email. Please try again");
                    continue;
                }

                //check domain // only gmail and hotmail domain
                String domain = useremail.substring(useremail.indexOf('@') + 1, useremail.indexOf('.'));    //gmail or hotmail

                boolean checkdomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

                if (!checkdomain) {
                    System.out.println("invalid domain");
                    continue;
                }
                //enter your password
                System.out.println("Please enter your password");
                String givenpassword = input.next();

                //check if login is successful

                if ((email1.equals(useremail) && givenpassword.equals(password1))) {
                    System.out.println("successfully logged in with email");
                    break;
                } else {// invalid checking
                    if (i != 1) { // ask again ==> i=3
                        System.out.println("invalid credentials!! " + (i - 1) + " chance to try");
                        i--; // we include it here to give it a count down out of the loop because it is an infinite loop rn and this will change it to only three times if it get to this point
                        continue;
                    } else {
                        System.out.println(" your account is locked- try again tomorrow");
                        System.exit(2);// this shuts down the JVM interesting
                    }
                }


            case 2:
                System.out.println("account number is chose");
                System.out.println("Please type your account number:");
                int an = input.nextInt();

                boolean checkaccountnumber = an >= 100 && an < 1000;

                if (!isInputvalid(an)) {
                    System.out.println("invalid account number, please try again");
                    continue;
                }
                System.out.println("Please enter your password");
                String givenPassword = input.next();
                if ((an == accountnum1 && givenPassword.equals(password1))) {
                    System.out.println("successfully logged in with account number");
                    break;
                } else {// invalid checking
                    if (i != 1) { // ask again ==> i=3
                        System.out.println("invalid credentials!! " + (i - 1) + " chance to try");
                        i--; // we include it here to give it a count down out of the loop because it is an infinite loop rn and this will change it to only three times if it get to this point
                        continue;
                    } else {
                        System.out.println(" your account is locked- try again tomorrow");
                        System.exit(2);// this shuts down the JVM interesting
                    }


                    //domain needs to be checked

                    break;


                }

}





}

    return email1;

    }

public static void makeOrder(String email1){
    for (int i = 0; i < 1;) {

        System.out.println("Which pizza would you like to have. (Please type pizza name. To creat your own pizza, please type special");

        Scanner input = new Scanner(System.in);

        String pizzaChoice = input.next();


// selection statements - > in the system we have 3 kinds of pizza. Salami, margarita, meatlovers, Special

        if (checkpizzathatwehave(pizzaChoice)) { //checking if pizza is valid


            if (pizzaChoice.equals("special")) {// checking if special pizza

                System.out.println(" i am building my own pizza");

            } else { //pizza is in system

                System.out.println("we have received your order. Price is $19.99");

            }

            System.out.println("Your order number is "+generateOrderNumber(email1));
            break;

        } else {
            System.out.println("you have entered invalid pizza name, please try again");
        }


    }
}//end of makeorder method

    public static String generateOrderNumber(String email1) {
        String ordernumber ="order_";
        for (int i = 0; i+1 < email1.length() ; i++) {
            ordernumber+= email1.substring(i,i+1);
            ordernumber+=i;
        }
        return ordernumber;
    }


    public static boolean checkpizzathatwehave(String pizzaChoice){
    String pizza1 ="margarita";
    String pizza2 ="Salami";
    String pizza3 ="meatlovers";
    String pizza4 ="veggie";
    String pizzaSpecial ="Special";

    return pizzaChoice.equalsIgnoreCase(pizza1)||
            pizzaChoice.equalsIgnoreCase(pizza2)||
            pizzaChoice.equalsIgnoreCase(pizza3)||
            pizzaChoice.equalsIgnoreCase(pizza4)||
            pizzaChoice.equalsIgnoreCase(pizzaSpecial);

}




}// end of statement

