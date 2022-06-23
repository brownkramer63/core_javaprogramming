package Day_28_Encapsulation.Encapsulation;

public class Student {
    private int age;
    private String name;

   // this is our getter
    //getter is only for reading data
   public int getAge(){

       return age;
   }

   public void setAge(int age){
       if (age<1 ){
           System.err.println("invalid age "+age);
         //  return; // to exit the method and terminate
           System.exit(1);
       }
       this.age=age;
   }
   public void setName(String name){
       boolean hasDigit= false;
       for (char each :name.toCharArray()
            ) {
           if (Character.isDigit(each)){
               hasDigit=true;
               break;
           }
       }
       if (hasDigit){
           System.err.println("invalid name: "+name);
           System.exit(1);
       }
       this.name=name;
   }

   public String getName(){
       return name;
   }
}
