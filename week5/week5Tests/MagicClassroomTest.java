package week5Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MagicClassroomTest {

    @Test
    public void testAddValidStudent() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student = new HogwartsStudent("Luna", "Ravenclaw", 5);
        classroom.addStudent(student);
        assertEquals(student, classroom.findStudent("Luna"));
    }

    @Test
    public void testAddNullStudent() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(null);
        assertNull(classroom.findStudent(null));
    }

    @Test
    public void testFindStudentBySpell() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        harry.learnSpell("Expelliarmus");
        classroom.addStudent(harry);

        assertEquals(harry, classroom.findStudentBySpell("Expelliarmus"));
    }

    @Test
    public void testGetStudentsByHouse() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent ron = new HogwartsStudent("Ron", "Gryffindor", 5);
        classroom.addStudent(harry);
        classroom.addStudent(ron);

        List<HogwartsStudent> gryffindors = classroom.getStudentsByHouse("Gryffindor");
        assertTrue(gryffindors.contains(harry));
        assertTrue(gryffindors.contains(ron));
    }

    @Test
    public void testGetStudentsSortedByHouse() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(new HogwartsStudent("Zacharias", "Hufflepuff", 5));
        classroom.addStudent(new HogwartsStudent("Hermione", "Gryffindor", 5));
        classroom.addStudent(new HogwartsStudent("Luna", "Ravenclaw", 5));

        List<HogwartsStudent> sorted = classroom.getStudentsSortedByHouse();
        assertEquals("Gryffindor", sorted.get(0).getHouse());
        assertEquals("Hufflepuff", sorted.get(1).getHouse());
        assertEquals("Ravenclaw", sorted.get(2).getHouse());
    }
}
