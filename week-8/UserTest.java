import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testAddAndRetrieveTask() {
        User user = new User("alice", "alice@example.com");
        Task task = new Task("Task 1", LocalDate.now());
        user.addTask(task);
        assertTrue(user.getTasks().contains(task));
    }

    @Test
    void testHasTask() {
        User user = new User("bob", "bob@example.com");
        Task task = new Task("Test", LocalDate.now());
        assertFalse(user.hasTask(task));
        user.addTask(task);
        assertTrue(user.hasTask(task));
    }

    @Test
    void testEmptyTaskList() {
        User user = new User("empty", "none@example.com");
        assertTrue(user.getTasks().isEmpty());
    }
}
