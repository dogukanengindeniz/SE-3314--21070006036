package week6EldoriaGame;

public class Warrior extends Hero implements Questable{

    public Warrior(String name, int level) {
        super(name, level);
    }

    public void attack(){
        System.out.println(name + " attacks with a full of power!");
    }


    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " week6EldoriaGame.Warrior has accepted the quest: " + questName);
    }
}
