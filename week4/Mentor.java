package week4;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends Character{
    private List<Quest> quests;


    public Mentor(String name, String title) {
        super(name, title);
        this.quests = new ArrayList<>();
    }

    public void overseeQuest(Quest quest){
        quests.add(quest);
        quest.setMentor(this);
    }

    public List<Quest> getQuests(){
        return quests;
    }
}
