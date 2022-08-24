package Groupwork.PastGroupWork;

public class DirtyCodeMethod {


    public boolean WearsCoat;
    public boolean HasATorch;
    public String CoatColor;
    public int BagCount;

    public String foxname;

    public void setInfo(boolean wearsCoat, boolean hasATorch, String coatColor, int bagCount,String foxname) {
        this.WearsCoat = wearsCoat;
        this.HasATorch = hasATorch;
        this.CoatColor = coatColor;
        this.BagCount = bagCount;
        this.foxname = foxname;
    }

    public void isguilty(){

        if (WearsCoat && CoatColor.equals("Black") && HasATorch && BagCount == 3){
            System.out.println(foxname+" is a suspect!");
        }else {
            System.out.println(foxname+" not a supspect!");
        }



    }





}
