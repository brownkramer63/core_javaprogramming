package day20_ArrayUtility;

public class ForEachLoopPractice {
    
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int each:  numbers ) {
          if(each%2 !=0){
              System.out.println(each);
          }
        }
        System.out.println("-----------------------");

        int[] nums = {100,20,30,40,5,3,4,2,1};
        int max = numbers[0];

        for (int each: nums){
            if(each >max){
                max=each;
            }
        }
        System.out.println(max);



        
    }
}
