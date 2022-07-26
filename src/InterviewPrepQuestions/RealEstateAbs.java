package InterviewPrepQuestions;

public abstract class RealEstateAbs {
    String name;

    public RealEstateAbs(String name){
        this.name=name;
    }
    public abstract double areaOfHouse();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                "area='" + areaOfHouse() + '\'' +
                '}';
    }
}
