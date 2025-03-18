package week4;

import java.util.ArrayList;
import java.util.List;

public class Advanturer extends Character{
    private String race;
    private List<Quest> quests;


    public Advanturer(String name, String title, String race) {
        super(name, title);
        this.race = race;
        this.quests = new ArrayList<>();
    }

    public void joinQuest(Quest quest){
        quests.add(quest);
        quest.addAdvanturer(this);
    }

    public List<Quest> getQuests(){
        return quests;
    }
}
