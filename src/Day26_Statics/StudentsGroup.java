package Day26_Statics;

import Day26_Statics.studentTask.Students;

import java.util.ArrayList;

public class StudentsGroup {

    public String groupname;
    public int groupId;
    public ArrayList<Students> student= new ArrayList<>();

    public StudentsGroup(String groupname, int groupId) {
        this.groupname = groupname;
        this.groupId = groupId;
    }



}
