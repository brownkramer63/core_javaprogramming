package Groupwork.GroupMeeting0824;

public class ClassA {
    public void show(){
        System.out.println("this is the first example");
    }
}
//---------------------------------------
class B extends ClassA {

    public void show() {
        System.out.println("this is how we typcially override a method");
    }
}
    //--------------------------------
  class AnonymousExample{
        public static void main(String[] args) {
           ClassA obj = new ClassA(){//start of the anonymous class
               public void show(){
                    System.out.println("anonymous class example");
                }
            };//end of the anonymous class

            obj.show();
        }
    }

