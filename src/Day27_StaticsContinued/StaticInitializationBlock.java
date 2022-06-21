package Day27_StaticsContinued;

public class StaticInitializationBlock {

    public static int a =100;
    public static double b;
    public static String c;

    static {

        a = 100;
        b = 20.5;
        c = "Java";
    } // we set these in our static block as soon as we call the class these will be assigned






}
