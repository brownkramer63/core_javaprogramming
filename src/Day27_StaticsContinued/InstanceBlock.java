package Day27_StaticsContinued;

public class InstanceBlock {

    {//{} under this constructor is known as an instance block
        System.out.println("instance block");
    }

    public InstanceBlock(){
        System.out.println("constructor");
    }


    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();





    }
}
