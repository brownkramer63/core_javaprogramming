package Day_37_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime exception has been caught");
            e.printStackTrace();
        }finally {
            System.out.println("finally block ");
        }


















    }
}
