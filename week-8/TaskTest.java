import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testTaskCreationAndAccessors() {
        Task task = new Task("Finish report", LocalDate.now().plusDays(3));
        assertEquals("Finish report", task.getTitle());
        assertFalse(task.isCompleted());
    }

    @Test
    void testMarkCompleted() {
        Task task = new Task("Submit", LocalDate.now());
        task.markCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    void testIsOverdueWhenDueToday() {
        Task task = new Task("Deadline", LocalDate.now());
        assertFalse(task.isOverdue());
    }

    @Test
    void testIsOverdueWhenOverdue() {
        Task task = new Task("Late Task", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }
}
