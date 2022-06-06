package day18_GarbageCollection;

public class TestPizzaObject {
    public static void main(String[] args) {

       Pizza pizza1= new Pizza(); // now this variable is referencing to an object
      // pizza1.size='M';

        pizza1.setinfo('l',2,3);

       Pizza pizza2 = new Pizza();
       pizza2.setinfo('s',1,2);
      // pizza2.size='M';

        System.out.println(pizza1);
        System.out.println(pizza2);


        System.out.println("------------------");

        double total = 0;

        for (int i = 0; i <20 ; i++) {

            Pizza small = new Pizza();
            small.setinfo('s',2,2);
            total +=small.calcCost();
            Pizza large = new Pizza();
            large.setinfo('l',1,3);
            total +=large.calcCost();
            Pizza medium = new Pizza();
            medium.setinfo('m',4,6);
           total+= medium.calcCost();
        }
        System.out.println("total = " + total);
    }

}
