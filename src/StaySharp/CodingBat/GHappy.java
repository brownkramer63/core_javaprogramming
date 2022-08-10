package StaySharp.CodingBat;

public class GHappy {
    public static void main(String[] args) {

        System.out.println(gHappy("xxggyygxx"));
    }

    public static boolean gHappy(String str) {
  char[] array=str.toCharArray();
  if (array.length==1){
      return false;
  }
  if (str.isEmpty()|| str.isBlank()){
      return true;
  }
  if (array[array.length-1]=='g' && array[array.length-2]!='g'){
      return false;
  }
        int count =0;
        int single=0;
        for (int i = 0; i < array.length-1 ; i++) {

            if (array[i]=='g'){
                if (!(array[i+1]=='g' || array[i-1]=='g')){
                    single++;
                    return false;
                }else {
                    count++;

                }


            }




        }
        if (count>=1 && single<=0){
            return true;

        }
        return false;
    }}





