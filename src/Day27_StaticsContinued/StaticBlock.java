package Day27_StaticsContinued;

public class StaticBlock {


    //constructor will print after main method
    // so order is static block, main method, constructor
    public StaticBlock(){
        System.out.println("Constructor");
    }

    static{
        System.out.println("Static Block");



    }
    //need main method if want to run static block
    //static block will always be excuted first
    //static block will only be executed once when intialized


    public static void main(String[] args) {
        System.out.println("Main Method");
    new StaticBlock();
    new StaticBlock();
    new StaticBlock();



    }
}
