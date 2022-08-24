package Groupwork.PastGroupWork;

public class DirtyCodeCleaned {
    public static void main(String[] args) {

        DirtyCodeMethod fox1 = new DirtyCodeMethod();

        fox1.WearsCoat = true;
        fox1.HasATorch=true;
        fox1.CoatColor="Black";
        fox1.BagCount=0;
        fox1.foxname="fox1";

        DirtyCodeMethod fox2 = new DirtyCodeMethod();

        fox2.WearsCoat = true;
        fox2.HasATorch=true;
        fox2.CoatColor="Black";
        fox2.BagCount=2;
        fox2.foxname="fox2";

        DirtyCodeMethod fox3 = new DirtyCodeMethod();

        fox3.WearsCoat = true;
        fox3.HasATorch=true;
        fox3.CoatColor="Black";
        fox3.BagCount=3;
        fox3.foxname="fox3";


        DirtyCodeMethod fox4 = new DirtyCodeMethod();

        fox4.WearsCoat = false;
        fox4.HasATorch=true;
        fox4.CoatColor="Gray";
        fox4.BagCount=3;
        fox4.foxname="fox4";

        fox1.isguilty();
        fox2.isguilty();
        fox3.isguilty();
        fox4.isguilty();









    }
}
