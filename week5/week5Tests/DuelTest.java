package week5Tests;

import org.junit.jupiter.api.Test;

public class DuelTest {

    @Test
    public void testBothStudentsKnowSpell() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        harry.learnSpell("Expelliarmus");
        draco.learnSpell("Expelliarmus");

        Duel.start(harry, draco, "Expelliarmus");
    }

    @Test
    public void testOneStudentKnowsSpell() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);
        harry.learnSpell("Expelliarmus");

        Duel.start(harry, draco, "Expelliarmus");
    }

    @Test
    public void testNeitherKnowsSpell() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 5);

        Duel.start(harry, draco, "Expelliarmus");
    }

    @Test
    public void testNullInputs() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        harry.learnSpell("Expelliarmus");

        Duel.start(null, harry, "Expelliarmus");
        Duel.start(harry, null, "Expelliarmus");
        Duel.start(harry, harry, null);
    }
}
