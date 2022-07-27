package InterviewPrepQuestions;

import javax.imageio.stream.ImageInputStream;

public class AnimalFeast {

    public static boolean animalfeast(String animal,String food){

        animal=animal.toLowerCase();
        food=food.toLowerCase();

        if ((animal.charAt(0)+"").equals(food.charAt(0)+"") && (animal.charAt(animal.length()-1)+"").equals(food.charAt(food.length()-1)+"") ){
            return true;
        }else {
            return false;
        }


    }

    public static void main(String[] args) {

        System.out.println(animalfeast("chicadee", "Chocolate cake"));


    }

//    All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish
//    must start and end with the same letters as the animal's name. For example, the great blue heron is
//    bringing garlic naan and the chickadee is bringing chocolate cake.
//    Write a method that takes the animal's name and dish as arguments and returns true or false to
//    indicate whether the beast is allowed to bring the dish to the feast.
//    Assume that beast and dish are always lowercase strings, and that each has at least two letters. Beast
//    and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the
//    string. They will not contain numerals.
}
