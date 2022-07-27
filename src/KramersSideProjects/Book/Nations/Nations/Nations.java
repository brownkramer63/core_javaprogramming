package KramersSideProjects.Book.Nations.Nations;

public class Nations {

    String name;
    String race;
    String landmasssize;
    String armysize;

    public Nations(String name, String race, String landmasssize, String armysize) {
        this.name = name;
        this.race = race;
        this.landmasssize = landmasssize;
        this.armysize = armysize;
    }

    @Override
    public String toString() {
        return "Nations{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", landmasssize='" + landmasssize + '\'' +
                ", armysize='" + armysize + '\'' +
                '}';
    }
}
