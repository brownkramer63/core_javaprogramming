package Day_38_ExceptionsContinued;

import org.w3c.dom.ls.LSOutput;

public class TestPersonObject {
    public static void main(String[] args) {


        Person person1 = new Person("Kramer", 25, 'M');

        System.out.println(person1);

       try {
           person1.setAge(-25);
       }catch (RuntimeException e){
           e.printStackTrace();
       }
        System.out.println(person1);





    }
}