package day18_GarbageCollection;

public class Pizza {

    public char size;
    public int numberofcheesetopping;
    public int numberofpepperonitopping;

    public  double calcCost(){
        double totalPrice=0;

        switch (size){

            case 's': // muhtar is a fucking genius
            case 'S':
                totalPrice = 10+ (2*numberofpepperonitopping)+(2*numberofcheesetopping);
                break;
            case 'm':
            case 'M':
                totalPrice = 12+ (2*numberofpepperonitopping)+(2*numberofcheesetopping);
                break;
            case 'l':
            case 'L':
                totalPrice = 14+ (2*numberofpepperonitopping)+(2*numberofcheesetopping);
                break;
            default:
                System.out.println("invalid size: "+ size);



        }

        return totalPrice;
    } // super cool instance method

    public void setinfo( char size , int numberofpepperonitopping, int numberofcheesetopping){
       this.size = size;
       this.numberofcheesetopping= numberofcheesetopping;
       this.numberofpepperonitopping=numberofpepperonitopping;

    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberofcheesetopping=" + numberofcheesetopping +
                ", numberofpepperonitopping=" + numberofpepperonitopping +
                ", Total Price=" + calcCost() + //we added this method into the toString method to show our total cost
                '}';
    } // right click and hit generate to find this method










    }






//1. Create a class named Pizza:
//            Attributes:
//                1. size
//                2. numberOfCheeseTopping
//                3. numberOfPepperoniTopping
//
//            Actions:
//                calcCost(): returns the total cost of the pizza
//                toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
//
//        Pizza cost is determined by:
//                        S: $10 + $2 per topping
//                        M: $12 + $2 per topping
//                        L: $14 + $2 per topping