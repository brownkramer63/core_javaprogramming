package Replits;

import java.util.Scanner;

public class SimpleRoomBook {

    //got it on first try hell yeah
//    Finish the method called simpleRoomBook() that will take four arguments and returns a boolean about if the room can be booked for that given day. The method is already called in the main method with arguments. The arguments in order are:
//    boolean isAvailable - if the isAvailable value is true continue to check the date, but if the value is false no rooms are available so there is no need to compare with the date
//    int month
//    int day
//    int year
//    The restrictions for booking a room include:
//
//    There is only open dates in the year 2018.
//    All rooms are booked between 7/1/2018(mm/dd/yy) - 7/8/2018(mm/dd/yy) -> both the dates are inclusive
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // WRITE YOUR CODE BELOW:
        if(isAvailable!= true){
            return false;
        }else{

            if(year!=2018){
                return false;
            }else{
                if(month!=7){
                    return true;
                }else{
                    if(day==1 || day== 2 || day==3 || day==4 || day==5 || day==7 || day ==8){
                        return false;
                    }else{
                        return true;
                    }






                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }




}
