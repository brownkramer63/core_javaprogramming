package Day27_StaticsContinued;

public class StaticBlockVrsInstanceBlockVrsConstructor {

public StaticBlockVrsInstanceBlockVrsConstructor(){
    System.out.println("Constructor");
}
    {
        System.out.println("Instance block");
        //depends on the object how many times it is executed
    }

    static {
        System.out.println("Static Block");
        //cannot be executed more than once
    }




    public static void main(String[] args) {
        System.out.println("Main method");
        StaticBlockVrsInstanceBlockVrsConstructor obj1 = new StaticBlockVrsInstanceBlockVrsConstructor();
        StaticBlockVrsInstanceBlockVrsConstructor obj2 = new StaticBlockVrsInstanceBlockVrsConstructor();

    }
}
