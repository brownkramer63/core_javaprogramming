package Lab09_ClassAndObjectConstructorEncapsulation.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private String PO, BA, SM;
    private ArrayList<Tester> testers= new ArrayList<>();
    private ArrayList<Developer>developers=new ArrayList<>();
    private int daysOfSprint;

    public String getPO() {
        return PO;
    }

    public String getBA() {
        return BA;
    }

    public String getSM() {
        return SM;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        setPO(PO);
        setBA(BA);
     setSM(SM);
   setDaysOfSprint(daysOfSprint);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void adddeveloper(Developer developer){
        developers.add(developer);
    }

    public void adddeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(String id){
        testers.removeIf(p -> p.getEmployeeID().equals(id));
    }


    private static void terminate(String arg, String err){
        if (arg==null || arg.trim().isEmpty() ){
            System.err.println(err);
            System.exit(1);
        }





    }



}
