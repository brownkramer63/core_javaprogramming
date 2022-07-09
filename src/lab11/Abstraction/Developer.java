package lab11.Abstraction;

public class Developer extends Employee implements WFH,ScrumMember{
    @Override
    public void work() {

    }

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void fixBug(){

    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void SprintPlanning() {

    }

    @Override
    public void workFromHome() {

    }
}
