package day14_methodsAndLoops;

public class OverloadingTheMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
    }

    public static void main(int[] args){
        System.out.println("B");
    }
    public static void main(double[] args){
        System.out.println("c");
    }
    public static void main(boolean[] args){
        System.out.println("D");
    }
}
