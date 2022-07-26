package InterviewPrepQuestions;

public class Fighter {


      String name;
      int health;
      int damagePerattack;

    public Fighter(String name, int health, int damagePerattack) {
        this.name = name;
        this.health = health;
        this.damagePerattack = damagePerattack;
    }
    public static String delcareWinner(Fighter fighter1, Fighter fighter2,String firstAttacker){
        do {
            if (firstAttacker.equals(fighter1.name)){
                fighter2.health-= fighter1.damagePerattack;
                firstAttacker=fighter2.name;
            }else {
                fighter1.health-= fighter2.damagePerattack;
                firstAttacker= fighter1.name;
            }}while (fighter1.health>0 && fighter2.health>0);
            if (fighter2.health>0){
                return fighter2.name + " wins";
            }else {
                return fighter1.name+" wins";
            }
        }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Tom",10,2);
        Fighter fighter2 = new Fighter("Harry",5,4);
        System.out.println(delcareWinner(fighter1,fighter2,"Harry"));
    }
    }

    //        Create a function that returns the name of the winner in a fight between two fighters.
//        9
//        Each fighter takes turns attacking the other and whoever takes the life of the other first is
//        victorious. Victory is defined as decreasing opponent’s health <= 0.
//        Each fighter will be a Fighter object/instance (which contains name, health, damagePerAttack and
//                also setInfomethod).
//                Both health and damagePerAttackwill be integers and larger than 0.
//        Example 1:
//        input :
//        Fighter tom = new Fighter(); tom.setInfo("Tom", 10, 2);
//        Fighter harry = new Fighter(); harry.setInfo("Harry", 5, 4);
//        declareWinner(tom, harry, "Tom")
//        output : "Tom wins"
//        Explanation :
//        Tom attacks Harry; Harry now has 3 health.
//                Harry attacks Tom; Tom now has 6 health.
//                Tom attacks Harry; Harry now has 1 health.
//                Harry attacks Tom; Tom now has 2 health.
//                Tom attacks Harry: Harry now has -1 health and is dead. Tom wins.



