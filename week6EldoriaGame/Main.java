package week6EldoriaGame;

public class Main {

    public static void main(String[] args) {
        Mage mage = new Mage("Aria", 4);
        Warrior warrior = new Warrior("Thorn", 5);
        Enemy goblin = new Enemy("Goblin", 3);

        QuestBoard questBoard = new QuestBoard();
        BattleManager battleManager = new BattleManager();

        questBoard.assignQuest(mage, "Save the Forest");
        questBoard.assignQuest(warrior, "Defeat the Shadowlord");

        warrior.attack();
        mage.castSpell();

        battleManager.startBattle(warrior, goblin);
    }
}
