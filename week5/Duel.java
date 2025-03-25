package week5;

import java.util.Random;

public class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell){
        if (!s1.knowsSpell(spell) && !s2.knowsSpell(spell)){
            System.out.println("Both wizards don't knows the spell so it's a draw.");
        } else if (s1.knowsSpell(spell) && !s2.knowsSpell(spell)) {
            System.out.println(s1.getName() + " wins.");
        } else if (!s1.knowsSpell(spell) && s2.knowsSpell(spell)){
            System.out.println(s2.getName() + " wins.");
        } else {
            Random rand = new Random();
            System.out.println((rand.nextBoolean() ? s1.getName() : s2.getName()) + " wins the battle" );
        }
    }
}
