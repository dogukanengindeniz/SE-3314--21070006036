package week5Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HogwartsStudentTest {

    @Test
    public void testLearnValidSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 5);
        boolean result = student.learnSpell("Expelliarmus");
        assertTrue(result);
        assertTrue(student.knowsSpell("Expelliarmus"));
    }

    @Test
    public void testLearnNullSpell() {
        HogwartsStudent student = new HogwartsStudent("Hermione", "Gryffindor", 5);
        boolean result = student.learnSpell(null);
        assertFalse(result);
    }

    @Test
    public void testLearnDuplicateSpell() {
        HogwartsStudent student = new HogwartsStudent("Ron", "Gryffindor", 5);
        student.learnSpell("Lumos");
        boolean result = student.learnSpell("Lumos");
        assertFalse(result);
    }

    @Test
    public void testKnowsSpell() {
        HogwartsStudent student = new HogwartsStudent("Neville", "Gryffindor", 5);
        student.learnSpell("Alohomora");
        assertTrue(student.knowsSpell("Alohomora"));
        assertFalse(student.knowsSpell("Crucio"));
    }
}