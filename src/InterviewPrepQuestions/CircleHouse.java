package InterviewPrepQuestions;

public class CircleHouse extends RealEstateAbs{

    double radius;

    public CircleHouse(String name, double radius) {

        super(name);
        this.radius=radius;
    }

    @Override
    public double areaOfHouse() {
        return radius*radius*Math.PI;
    }
}
