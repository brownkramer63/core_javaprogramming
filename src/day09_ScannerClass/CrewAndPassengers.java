package day09_ScannerClass;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int numberofpeople = 50;
        String result = "";

        switch (numberofpeople){
            case 50:
                result = "20 crew, 30 passengers";
                break;
            case 75:
                result="25 crew, 50 passengers";
                break;
            case 100:
                result="30 crew, 70 passengers";
                break;
            default: result="invalid";
        }
        System.out.println(result);
        // ternary way to do this problem

        String result1 =(numberofpeople==50 || numberofpeople==75|| numberofpeople==100)
                ?(numberofpeople==50)?"20 crew, 30 passengers":(numberofpeople==75)?"25 crew, 50 passengers":
                "30 crew, 70 passengers"


                : "invalid";
        System.out.println(result1);









    }
}
