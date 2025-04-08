package week6EldoriaGame;

public class BattleManager {

    public void startBattle(Hero hero, Enemy enemy){
        System.out.println(hero.getName() + " (Level " + hero.getLevel() + ") vs " + enemy.getName() + " (Level " + enemy.getLevel() + ")");
        if (hero.getLevel() >= enemy.getLevel()){
            System.out.println(hero.getName() + " wins the duel!");
        } else {
            System.out.println(enemy.getName() + " lost the duel!");
        }
    }
}
