package Groupwork;

public class WeekNoteBook {

    public static void notebook (int week, int days){

        for (int j = 1; j < week+1; j++) {
            System.out.println("week: "+j);
            for (int i = 1; i <days+1 ; i++) {
                System.out.println("day: "+i);

            }

        }
    }

    public static void main(String[] args) {
       notebook(6,5);
    }

}
