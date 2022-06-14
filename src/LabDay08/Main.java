package LabDay08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Budget Planner!");
        Scanner input = new Scanner (System.in);
         //Create user
        // ask how many people in the budget planner
        System.out.println("Please enter how many people are in your group");



        //  int amountofusers = input.nextInt(); this is added into the custom method below

        // need to have a individual user for each of the people

        ArrayList<User> userlist = prepareUserLists(input);

        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count: "+ userlist.size());

        System.out.println("Please see options below and select options using number");

        String[] optionlist = prepareoptionlist();

        for (int i = 0; i <prepareoptionlist().length ; i++) {

            System.out.println(optionlist[i]+ ":"+ (i+1));
        }


        for (int i = 0; i <1000 ; i++) {


            System.out.println("Please enter number to access menu options:");

           int answer1 = input.nextInt();

            switch (answer1 - 1) {

                case 0:
                    // ask expense name, amount, user

                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                     expense.expenseName = input.next();

                    System.out.println("Expense amount: ");
                    expense.amount= input.nextInt();


                    System.out.println("Which user made this expense? Just type user id");

                    //show all users: id : 0 name: ozzy

                    for (User user: userlist
                         ) {
                        System.out.println(" id: "+userlist.indexOf(user)+ " name: "+ user.name);
                    }

                    // userlist: kramer and exc....


                    int userId = input.nextInt();

                   User user= userlist.get(userId);

                    expense.user = user.name;


                    expenseList.add(expense);




                    break;
                case 1:
                    System.out.println("Please enter user name that you would like to search: ");

                    String username = input.next();

                    User myUser = null;

                    for (User chosenuser: userlist
                         ) {
                        if (chosenuser.name.equals(username)){
                            myUser = chosenuser;
                            break;
                        }

                    }
                    if (myUser==null){
                        System.out.println("User does not exist!");
                        break;
                    }
// now we need to list specific person expense
                   int UserxpenseAmount=0;
                    int expensecount =0;
                    for (int k = 0; k <expenseList.size() ; k++) {

                       if (expenseList.get(k).user.equals(username)){
                           expensecount++;
                           UserxpenseAmount +=expenseList.get(k).amount;
                           System.out.println(expensecount + " -expense amount: "+ expenseList.get(k).amount+ " expense by: "
                           + expenseList.get(k).user);
                       }





                    }
                    System.out.println(myUser.name + " spent $"+ UserxpenseAmount);








//                  my attempt at this
//                   String username = input.next();
//
//                   if(userlist.contains(username)){
//
//                      int usercase1 = expenseList.indexOf(username);
//
//                       System.out.println("User: "+ expenseList.get(usercase1).user+ " Expense amount: "+
//                               expenseList.get(usercase1).amount+ " Expense name: "+expenseList.get(usercase1).expenseName);
//
//
//                   }else {
//                       System.out.println("Invalid entry please reenter valid name");
//                   }







                    break;

                case 2:
                    for (int j = 0; j <expenseList.size() ; j++) {

                        System.out.println((j+1) + " expense amount: "+expenseList.get(j).amount + ", expense by: "+
                                expenseList.get(j).user);
                    }



                    break;
                //example what we want in case 1
                //0 - expense amount : 100 , expense by: ozzy
                //1 - expense amount : 1000 , expense by: kramer
                case 3:

                    double totalamount = 0;

                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for (Split split: splitList
                         ) {
                        totalamount+=split.amount;
                    }

                    makeSplit(totalamount,splitList);















                    break;
                case 4:

                    //need to do this on our own last menu option to do
                    for (User user1:userlist
                         ) {
                        System.out.println(user1.name +" "+ user1.email );
                    }



                    break;
                case 5:
                    System.exit(0);
            }
        }









        }

    public static void makeSplit(double totalamount, ArrayList<Split> splitList) {

        double amount = totalamount/splitList.size();
        //now we have total and amount each person owes

        for (Split split: splitList
             ) {
            if (split.amount> amount){
                System.out.println(split.userName+ " needs to take back "+ (split.amount-amount));
            }else {
                System.out.println(split.userName+ " needs to pay "+(amount- split.amount));
            }

        }






    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for (Expense expense: expenseList
             ) {
            // 2 questions we need names and totals
            Split split = existSplitList(expense.user,splitList);

            if (split!=null){
                split.amount+=expense.amount;
            }else {
                Split willbeadded=  new Split();
                willbeadded.userName= expense.user;
                willbeadded.amount= expense.amount;
                splitList.add(willbeadded);
            }






        }

        return splitList;
    }

    public static Split existSplitList(String user, ArrayList<Split> splitList) {

        for (Split split: splitList
             ) {
            if (split.userName.equals(user))
                return split;
        }

        return null;
    }


    public static ArrayList<User> prepareUserLists(Scanner input) {

        ArrayList<User> userList = new ArrayList<>();

        int amountofusers = input.nextInt();

        for (int i = 0; i < amountofusers; i++) {

            //here we will add user information
            // create class and create objects from class

            User user = new User();

            System.out.println("Please enter name: ");

            user.name = input.next();

            System.out.println("Please enter email: ");

            user.email = input.next();

            userList.add(user); // what i am trying to save is name and email objects so we save the user object

        }
        return userList;
    }

    public static String[] prepareoptionlist(){
                /*
        creating options:
        0 : make expense
        1: list specific person expense
        2: list all expenses
        3: make split
        4: list all users
        5: close the budget
         */
        String[] optionsList = {"Make expense", "List specific person expense", "list all expenses","Make split","list all users","close the budget"};
   return optionsList;
    }




}
