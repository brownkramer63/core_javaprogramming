package KramersSideProjects.Book.Nations.Species;

public class Human extends Races{
    public Human(String name, String populationSize, int intelligance, String bodysize) {
        super(name, populationSize, intelligance, bodysize);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", populationSize='" + populationSize + '\'' +
                ", intelligance=" + intelligance +
                ", bodysize='" + bodysize + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Human empiretest = new Human("empiretest11","lkarge",4,"large"  );

    }
    //    String capital= "20 wall city";
//    String colors="red and gold";
//    String name= "human 1";
//    String populationsize = "300 million";
//    String intelligance= "7/10";
//    String bodysize="6 foot average";




}
