package org.example;

public class Mage extends Hero implements Questable{
    String quest;

    public Mage(String n, int l) {
        super(n, l);
    }
    
    public void acceptQuest(String questName){
        quest = questName;
    }

    public void castSpell(){
        System.out.print(name + " casts spell!");
    }
}
