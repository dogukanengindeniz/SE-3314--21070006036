package week11;

/**
 * Represents a quest in Middle-Earth.
 */
public class Quest {
    private String type;
    private int difficulty;

    public Quest(String type, int difficulty) {
        this.type = type;
        this.difficulty = difficulty;
    }

    public String getType() { return type; }
    public int getDifficulty() { return difficulty; }
}
