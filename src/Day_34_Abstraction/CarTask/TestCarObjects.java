package Day_34_Abstraction.CarTask;

public class TestCarObjects {
    public static void main(String[] args) {

         Honda honda1 = new Honda("accord","Blue",2002,10000);
         Audi audi1 = new Audi("Q6","Black",2010,30000);
         Tesla tesla1 = new Tesla("model Y","Black",2010,50000);
        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);

        honda1.stop();
        audi1.stop();

        System.out.println("-------------------");
        
        honda1.start();
        tesla1.start();
        audi1.start();

    }
}
