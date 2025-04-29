import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void testAddUserAndTask() {
        Project project = new Project();
        User user = new User("john", "john@example.com");
        Task task = new Task("Setup", LocalDate.now());

        project.addUser(user);
        project.addTask(task);

        assertEquals(task, project.getTaskByTitle("Setup"));
    }

    @Test
    void testGetTaskByTitleNotFound() {
        Project project = new Project();
        assertNull(project.getTaskByTitle("Missing"));
    }
}
