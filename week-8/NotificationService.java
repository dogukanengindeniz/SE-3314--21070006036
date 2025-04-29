import java.util.*;

public class NotificationService {
    private Map<User, List<String>> notifications = new HashMap<>();

    //Requires: user != null, message != null
    //Effects: adds a notification message for the user
    public void sendNotification(User user, String message){
        notifications.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
    }

    //Requires: user != null
    //Effects: returns list of notifications for the user, or empty list if none
    public List<String> getNotifications(User user){
        return notifications.getOrDefault(user, Collections.emptyList());
    }
}
