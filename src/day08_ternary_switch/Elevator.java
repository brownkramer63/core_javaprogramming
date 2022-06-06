package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 2;
        String result= "Invalid floor";

        if(floorNumber >= 1 && floorNumber <=3) {
            result = "Floor " + floorNumber + " is selected. Companies ";
            if (floorNumber == 1) {
                result += "lobby and others";
            } else if (floorNumber == 2) {
                result += "Cydeo and others";
            } else {
                result += "Lyft and others";
            }
        }else{ result = "Invalid floor";

            }
        System.out.println(result);
        }
        }


