package Day_37_Exceptions;

public class Pizza {

     private char size;
    private int numberOfCheeseToppings;
    private int numberOfPepperoniTopping;


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniTopping) {
      setSize(size);
      setNumberOfCheeseToppings(numberOfCheeseToppings);
      setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public  double calcCost(){
        double totalPrice=0;

        switch (size){

            case 's': // muhtar is a fucking genius
            case 'S':
                totalPrice = 10+ (2*numberOfPepperoniTopping)+(2*numberOfCheeseToppings);
                break;
            case 'm':
            case 'M':
                totalPrice = 12+ (2*numberOfPepperoniTopping)+(2*numberOfCheeseToppings);
                break;
            case 'l':
            case 'L':
                totalPrice = 14+ (2*numberOfPepperoniTopping)+(2*numberOfCheeseToppings);
                break;
            default:
                System.out.println("invalid size: "+ size);



        }

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberofcheesetopping=" + numberOfCheeseToppings +
                ", numberofpepperonitopping=" + numberOfPepperoniTopping +
                ", Total Price=" + calcCost() + //we added this method into the toString method to show our total cost
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)){
            System.err.println("invalid object please retry");
            System.exit(1);

        }
        if (size==((Pizza)obj).size){
            if (numberOfPepperoniTopping== ((Pizza)obj).numberOfPepperoniTopping){
                return true;
            }
        }
        return false;
    }
}
