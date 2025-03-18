package week4;

import java.util.ArrayList;
import java.util.List;

public class Quest {
    private String name;
    private String difficulty;
    private Mentor mentor;
    private List<Advanturer> advanturers;

    public Quest(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        this.advanturers = new ArrayList<>();
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void addAdvanturer(Advanturer advanturer){
        advanturers.add(advanturer);
    }

    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public List<Advanturer> getAdvanturers() {
        return advanturers;
    }

    public Mentor getMentor() {
        return mentor;
    }
}
