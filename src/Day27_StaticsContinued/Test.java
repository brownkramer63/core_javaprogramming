package Day27_StaticsContinued;

import Day27_AccessModifiers.AccessModifiers;

public class Test {

    public static void main(String[] args) {
        System.out.println(StaticInitializationBlock.a );
        System.out.println(StaticInitializationBlock.b );
        System.out.println(StaticInitializationBlock.c );

        System.out.println("---------------------");

        System.out.println(AccessModifiers.publicDate);// if this was not public we probably couldnt access it


    }
    //these will pull the data from the other class and will utilize the static block in this class





}
