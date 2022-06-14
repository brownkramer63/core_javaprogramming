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

        System.out.println("Added user count: "+ userlist.size());

        System.out.println("Please see options below and select options using number");

        String[] optionlist = prepareoptionlist();

        for (int i = 0; i <prepareoptionlist().length ; i++) {

            System.out.println(optionlist[i]+ ":"+ (i+1));
        }

        for (int i = 0; i <-1 ; i++) {


            System.out.println("Please enter number:");

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
                        System.out.println("id: "+userlist.indexOf(user)+ "name: "+ user.name);
                    }

                    // userlist: kramer and exc....


                    int userId = input.nextInt();

                   User user= userlist.get(userId);

                    expense.user = user.name;

                    ArrayList<Expense> expenseList = new ArrayList<>();

                    expenseList.add(expense);




                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        }









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
