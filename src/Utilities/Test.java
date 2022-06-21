package Utilities;

import Day27_StaticsContinued.Data; //we imported this package then to class

public class Test {
    public static void main(String[] args) {
        System.out.println(Data.d);
        System.out.println(Data.e);

        Data.method3();
        // we can import all these statics above
        //to import an instance method we need to creat an object first

        Data obj = new Data();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.method1();
        obj.method2();

    }
}
