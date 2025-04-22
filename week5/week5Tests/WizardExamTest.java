package week5Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class WizardExamTest {

    @Test
    public void testPassAllSpellsKnown() {
        HogwartsStudent student = new HogwartsStudent("Ginny", "Gryffindor", 5);
        student.learnSpell("Lumos");
        student.learnSpell("Alohomora");

        WizardExam exam = new WizardExam(List.of("Lumos", "Alohomora"));
        assertTrue(exam.pass(student));
    }

    @Test
    public void testPassWithMissingSpells() {
        HogwartsStudent student = new HogwartsStudent("Draco", "Slytherin", 5);
        student.learnSpell("Lumos");

        WizardExam exam = new WizardExam(List.of("Lumos", "Alohomora"));
        assertFalse(exam.pass(student));
    }

    @Test
    public void testEvaluate() {
        HogwartsStudent student = new HogwartsStudent("Cho", "Ravenclaw", 5);
        student.learnSpell("Expelliarmus");

        WizardExam exam = new WizardExam(List.of("Expelliarmus"));
        exam.evaluate(student);  // Should print pass/fail message
    }
}
