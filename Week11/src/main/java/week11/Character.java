package week11;

/**
 * Represents a character in Middle-Earth.
 */
public class Character {
    private String name;
    private String race;
    private int age;
    private String uniqueAttribute;

    public Character(String name, String race, int age, String uniqueAttribute) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.uniqueAttribute = uniqueAttribute;
    }

    public String getName() { return name; }
    public String getRace() { return race; }
    public int getAge() { return age; }
    public String getUniqueAttribute() { return uniqueAttribute; }

    public void participateInQuest(Quest quest) {
        System.out.println(name + " is participating in " + quest.getType() + " quest.");
    }
}
