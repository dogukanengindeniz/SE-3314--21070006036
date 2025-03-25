package week5;

import java.util.HashSet;
import java.util.Set;

public class HogwartsStudent {

    private String name;
    private String house;
    private int year;
    private Set<String> spellsLearned;

    public HogwartsStudent(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new HashSet<>();
    }

    public boolean learnSpell(String spell){
        if (spell == null || spellsLearned.contains(spell)){
            return false;
        }
        spellsLearned.add(spell);
        return true;
    }

    public boolean knowsSpell(String spell){
        return spell != null && spellsLearned.contains(spell);
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public int getYear() {
        return year;
    }

    public Set<String> getSpellsLearned() {
        return spellsLearned;
    }
}
