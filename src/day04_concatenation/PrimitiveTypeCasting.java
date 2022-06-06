package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        // implicit casting = casting smaller type to larger
        byte a = 15;
        short b = a;

        int c = a;// this is an example of implicit casting


        System.out.println(b);

long d = 3000L;
float f = d; // implicit casting


   // explicit casting

int x = 100;
 byte y = (byte)x ;
// need to add the () add specify what the smaller primitive we are casting the larger into

  float z = 20.8f; // need to add f to make it assigned as a float instead of a double
        short q = (short) z;
     // this will also change the data amount
        System.out.println(q);
        int num = 500;
        byte result = (byte) num;
        System.out.println(result);// this will not give you 50 it will give you the wrong answer







    }

}
