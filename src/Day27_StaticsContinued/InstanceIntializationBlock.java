package Day27_StaticsContinued;

public class InstanceIntializationBlock {

    public String name;
    public int age;

//    {
//        name="James";
//        age=20;
//
//        //this will get executed for every single object and will now be the default output for this instance variable
//        // we will only use instance block when we want a default value
//
//    }


    public InstanceIntializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceIntializationBlock obj1 = new InstanceIntializationBlock("kramer",25);
        InstanceIntializationBlock obj2 = new InstanceIntializationBlock("Marissa",24);

        System.out.println(obj1.name);
        System.out.println(obj2.name);



    }







}
