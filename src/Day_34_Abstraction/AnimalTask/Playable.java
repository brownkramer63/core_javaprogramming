package Day_34_Abstraction.AnimalTask;

public interface Playable {

    boolean isFriendly=true; // static and final

    public static void main(String[] args) {
        System.out.println(isFriendly);
    }



    void playable();
}
