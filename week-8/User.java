import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    //Requires: username != null, email != null
    //Effects: creates a new user with empty task list

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Task> getTasks() {
        return Collections.unmodifiableList(tasks);
    }

    public String getEmail() {
        return email;
    }

    //Requires: task != null
    //Effects: adds a task to the user's task list
    public void addTask(Task task){
        tasks.add(task);
    }

    public boolean hasTask(Task task){
        return tasks.contains(task);
    }
}
