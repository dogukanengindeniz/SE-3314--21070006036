import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<User> users;
    private List<Task> tasks;

    public Project(){
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    //Requires: user != null
    //Effects: adds a user to the project
    public void addUser(User user){
        users.add(user);
    }

    //Requires: task != null
    //Effects: adds a task to the project
    public void addTask(Task task){
        tasks.add(task);
    }

    //Requires: title != null
    //Effects: returns the task with the given title, or null if not found
    public Task getTaskByTitle(String title){
        for (Task t : tasks){
            if (t.getTitle().equals(title)) return t;
        }
        return null;
    }
}
