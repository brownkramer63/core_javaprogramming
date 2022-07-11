package Day_37_Exceptions;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        System.out.println("Program 1 start");
        int[] arr ={1,2,3,4};
        try {
            System.out.println(arr[1000]);
            System.out.println("try block");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("catch block");
        }



        System.out.println("Program 1 ended");

    }
}
