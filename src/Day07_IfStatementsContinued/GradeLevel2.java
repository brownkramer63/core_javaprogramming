package Day07_IfStatementsContinued;

public class GradeLevel2 {
    public static void main(String[] args) {
        int gradeLevel = 18;

        if (gradeLevel <= 5) {
            System.out.println("Elementary School");
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            System.out.println("Middle School");
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println("High SChool");
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println("College");
        } else {
            System.out.println("Grad School");
        }
    }
}