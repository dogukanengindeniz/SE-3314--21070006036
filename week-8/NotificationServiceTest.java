import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void testSendAndRetrieveNotifications() {
        NotificationService service = new NotificationService();
        User user = new User("mike", "mike@example.com");

        service.sendNotification(user, "New task assigned");
        List<String> notes = service.getNotifications(user);

        assertEquals(1, notes.size());
        assertEquals("New task assigned", notes.get(0));
    }

    @Test
    void testEmptyNotificationList() {
        NotificationService service = new NotificationService();
        User user = new User("empty", "no@email.com");
        assertTrue(service.getNotifications(user).isEmpty());
    }
}
