package day08_ternary_switch;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 6;
        String location = "unknown";
        int numofgroups = 0;
        String teacher =" unknown";

        if (grade >=1 && grade<=6){
            if(grade==1){
                location = "Apple orchard";
                numofgroups =3;
                teacher ="Ms. Smith";
            } else if (grade ==2 ) {
                location= "Zoo";
                numofgroups= 7;
                teacher ="Mr.Lee";
            } else if (grade ==3) {
                location ="Aquarium";
                numofgroups=5;
                teacher = "Ms.Wilson";}
            else if (grade==4) {
                location= "Movie Theater";
                numofgroups=2;
                teacher ="Ms. Reyes";}
            else if (grade==5) {
                location="Museum";
                numofgroups= 5;
                teacher = "Ms.Lela";
            } else if (grade==6) {
                location="Six Flags";
                numofgroups=8;
                teacher ="Mr.Watt";}
            System.out.println("Grade "+grade+ " will have the field trip at the "+location+ " with teacher "+teacher+
                    " with "+numofgroups+" groups of students.");






/*
2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown

 */



    }
}}
