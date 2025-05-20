package week11;

/**
 * Smoke test for the Middle-Earth simulation.
 */
public class Main {
    public static void main(String[] args) {
        Character aragorn = new Character("Aragorn", "Human", 87, "Sword");
        Quest rescue = new Quest("RescueMission", 4);
        aragorn.participateInQuest(rescue);
    }
}
