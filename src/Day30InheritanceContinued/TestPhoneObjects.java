package Day30InheritanceContinued;

public class TestPhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iphone","iphone 12","large",1000,"Black");
        Samsung samsung = new Samsung("Samsung","galaxy s10","Huge",800,"White");
        Nokia nokia = new Nokia("nokia","axe","Small",250,"Pink");

        iphone.faceTime("brownkramer64@gmail.com");
        samsung.freeze();
        nokia.selfdefense();

        samsung.text(2177413554L);

        System.out.println(iphone);









    }
}
