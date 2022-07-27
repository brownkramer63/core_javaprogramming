package InterviewPrepQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalswentinTwobyTwo {

    static Map<String,Integer> twobytwo(List<String> animal){
        HashMap<String,Integer> output= new HashMap<>();

        for (String each:animal
             ) {
            int num=output.getOrDefault(animal,0);
            if (num<2){
                output.put(each,++num);
            }
        }
output.entrySet().removeIf(e-> e.getValue()==1);
        return output;
    }
}
