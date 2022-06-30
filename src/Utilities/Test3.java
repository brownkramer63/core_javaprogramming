package Utilities;

import Day_31_MethodOverloading.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier{

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();
        //can call it because it is a sublcass of proctectedaaccedmodifier class


    }

}
