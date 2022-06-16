package Day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str ="aaabbbbcccccc";

    //what we want it to say a3b4c6
        //so we need each character and each frequency

        String result ="";

        for (String each : str.split("")) {

            int frequency =Collections.frequency(Arrays.asList(str.split("")),each);

            if (!(result.contains(each))){
                result+=each+ frequency;
            }
        }
        System.out.println(result);














    }
}
