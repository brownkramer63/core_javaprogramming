package InterviewPrepQuestions.realestateQ;

import InterviewPrepQuestions.realestateQ.RealEstateAbs;

public class SquareHouse extends RealEstateAbs {
    double side;

    public SquareHouse(String name, double side) {
        super(name);
        this.side=side;
    }

    @Override
    public double areaOfHouse() {
        return side*side;
    }
}
