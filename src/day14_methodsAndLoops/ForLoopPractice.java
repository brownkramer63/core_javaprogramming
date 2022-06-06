package day14_methodsAndLoops;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i=10; i>=5; i--){
            System.out.println("Hello Cydeo");
        }
        System.out.println("Hello World");

        System.out.println("-----------------------");

        int sum =0;

        for(int i =1; i<=100; i++){//some of all numbers 1 to 100

            sum= sum+i;
        }
        System.out.println(sum);

        System.out.println("--------------------------");

        for(char i='A';i<='Z';i++){//print all letters a to z
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("-------------------");

        for (char i='Z';i>='A';i--){
            System.out.println(i);
        }



    }
}
