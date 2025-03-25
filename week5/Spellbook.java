package week5;

import java.util.ArrayList;
import java.util.List;

public class Spellbook {

    private List<String> spells;

    public Spellbook(){
        this.spells = new ArrayList<>();
    }

    public void addSpell(String spell){
        if (spell != null && !spells.contains(spell)){
            spells.add(spell);
        }
    }

    public String getSpell(int index){
        return (index >= 0 && index < spells.size()) ? spells.get(index) : null;
    }

    public List<String> getSpellsByPrefix(String prefix){
        List<String> result = new ArrayList<>();
        for (String spell : spells){
            if (spell.startsWith(prefix)){
                result.add(spell);
            }
        }
        return result;
    }
}
