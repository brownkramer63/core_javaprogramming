package day14_methodsAndLoops;

public class WarmUps {
    public static void main(String[] args) {

       String str1 ="one";
       String str2= "eight";

       String stranswer = combine(str1,str2);

        System.out.println(stranswer);

        System.out.println("---------------------------");

        int num1 =50;
        int num2 = 40;
        int num3=30;
        int num4=20;

        System.out.println(sumof2numbers(num1,num2));






    }
    public static String combine(String str1, String str2){

       String result="";

       if(str1.endsWith(""+str2.charAt(0))) //adding the "" will change the char to a string and allow us to concatenate these
       { result = str1 + str2.substring(1);}
       else {result = str1+str2;}
        return result;
       }

// ----------------------------------------------------------


    public static int sumof2numbers (int num1,int num2) {

        int sum1 = num1 + num2;
        return sum1;
    }
      public static int sumof3numbers (int num1,int num2,int num3){

          int sum2 = num1+num2+num3;
          return sum2;
        }

        public static int sumof4numbers (int num1,int num2,int num3, int num4){

        int sum3= num1+num2+num3+num4;

        return sum3;
        }




    }





//Task1:
//        Create a method named combine that can take two string and then add them together and returns it.
//        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
//
//        combine("one", "eight")  ==> oneight
//
//        Task 2:
//        1. create a method that can find the sum of two integer numbers
//        method name: sumOf2Numbers
//
//        2. create a method that can find the sum of three integer numbers
//        method name: sumOf3Numbers
//
//        3. create a method that can find the sum of four integer numbers
//        method name: sumOf4Numbers