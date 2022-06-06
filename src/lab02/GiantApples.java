package lab02;

public class GiantApples {
    public static void main(String[] args) {

        int apple1= 10;
        int apple2= 10;
        int apple3= 10;
        int apple4= 10;
        int apple5= 10;
        int apple6= 120;
        int apple7= 10;

        int sum1 = apple1 + apple2 + apple3;

        int sum2 = apple4 +apple5 + apple6;

        if(sum1==sum2){
            System.out.println("Found it! apple 7 is heavier than others");}
        else { if (sum1> sum2) {if(apple1==apple2)System.out.println("apple 3 is heaviest");}
        else {if(apple1>apple2) System.out.println("apple 1 is heaviest");}
        if(apple1<apple2) { System.out.println("apple 2 is heaviest");}}
        if (sum1<sum2){if(apple4==apple5)System.out.println("apple 6 is heaviest");}
        else {if(apple4>apple5) System.out.println("apple 4 is heaviest");}
        if(apple4<apple5) { System.out.println("apple 5 is heaviest");}

    }

        }




