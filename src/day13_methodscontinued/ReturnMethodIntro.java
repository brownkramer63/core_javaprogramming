package day13_methodscontinued;

public class ReturnMethodIntro {
    public static void main(String[] args) {

     // sum(3,3);
      int total =additon(4,5);

      int thesquare= square(10);

        System.out.println(thesquare);

    }
//
//    public static void sum(int n1, int n2){
//        int result= n1+n2;
//    }// only use void if you dont want any data to be returned from the method
 public static int additon (int n1, int n2){
        int result = n1+n2;
        return result;

 }

 public static int square (int num){

    int square = num*num;
    return square;
 }


}
