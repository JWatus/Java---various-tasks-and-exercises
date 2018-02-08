public class Kata {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        String winner = "";

        while (fighter1.health > 0 && fighter2.health > 0) {

            if (firstAttacker.equals(fighter1.name)) {

                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                System.out.println(fighter1.name + " attacks " + fighter2.toString() + "; " + fighter2.toString() + " now has " + fighter2.health + " health.");

                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    System.out.println(fighter2.name + " now has " + fighter2.health + " health and is dead. " + fighter1.name + " wins.");
                    break;
                }

                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " attacks " + fighter1.toString() + "; " + fighter1.toString() + " now has " + fighter1.health + " health.");

                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    System.out.println(fighter1.name + " now has " + fighter1.health + " health and is dead. " + fighter2.name + " wins.");
                    break;
                }
            }

            if (firstAttacker.equals(fighter2.name)) {

                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " attacks " + fighter1.toString() + "; " + fighter1.toString() + " now has " + fighter1.health + " health.");

                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    System.out.println(fighter1.name + " now has " + fighter1.health + " health and is dead. " + fighter2.name + " wins.");
                    break;
                }

                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                System.out.println(fighter1.name + " attacks " + fighter2.toString() + "; " + fighter2.toString() + " now has " + fighter2.health + " health.");

                if (fighter2.health <= 0) {

                    winner = fighter1.name;
                    System.out.println(fighter2.name + " now has " + fighter2.health + " health and is dead. " + fighter1.name + " wins.");
                    break;
                }
            }
        }
        return winner;
    }
}