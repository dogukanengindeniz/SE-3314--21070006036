package week6EldoriaGame;

public class Mage extends Hero implements Questable{

    public Mage(String name, int level) {
        super(name, level);
    }

    public void castSpell(){
        System.out.println(name + " casts a spell!");
    }


    @Override
    public void acceptQuest(String questName) {
        System.out.println(name + " the week6EldoriaGame.Mage has accepted the quest: " + questName);
    }
}
