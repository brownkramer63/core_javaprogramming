package InterviewPrepQuestions.realestateQ;

import InterviewPrepQuestions.realestateQ.RealEstateAbs;

public class RectangleHouse extends RealEstateAbs {

    double width;
    double length;

    public RectangleHouse(String name, double length, double width) {
        super(name);
        this.width= width;
        this.length=length;
    }

    @Override
    public double areaOfHouse() {
        return length*width;
    }
}
