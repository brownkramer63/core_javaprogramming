package day03_variables;

public class PrimativeDataTypeIntro2 {
    public static void main(String[] args) {
  // datatype variable name= data
      char c = 'a';
      char b = 'b';
     // char ab='ab';
      //cannot store multiple characters into char so ab will not work
        char ch1= 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);
        // since ascii number for A is 65 both will print A
 int sum ='A' + 'B';
 //        65 + 66
        System.out.println(sum);
        // adds sum of char numbers
//boolean r1 = 123;
// boolean r2 =2.5;
 // boolean r3 = "Java"; none of these will work for booleans
 boolean r4 = true;
 boolean r5 = false;
 boolean r6= 100> 10;
        System.out.println(r6);
boolean r7 = 0 <-1;
        System.out.println(r7);
        //as long as output will be true or false you can use boolean

    }
}
