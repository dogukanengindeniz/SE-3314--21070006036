import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void testAssignTask() {
        TaskManager manager = new TaskManager();
        User user = new User("jane", "jane@example.com");
        Task task = new Task("Design", LocalDate.now());

        manager.assignTask(user, task);
        assertTrue(user.getTasks().contains(task));
    }

    @Test
    void testRemoveTask() {
        TaskManager manager = new TaskManager();
        User user = new User("leo", "leo@example.com");
        Task task = new Task("Draft", LocalDate.now());

        user.addTask(task);
        manager.removeTask(user, task);
        assertFalse(user.getTasks().contains(task));
    }

    @Test
    void testListTasks() {
        TaskManager manager = new TaskManager();
        User user = new User("max", "max@example.com");
        Task task1 = new Task("One", LocalDate.now());
        Task task2 = new Task("Two", LocalDate.now());

        user.addTask(task1);
        user.addTask(task2);

        List<Task> result = manager.listTasks(user);
        assertEquals(2, result.size());
    }
}
