import java.util.List;

public class TaskManager {
    //Requires: user != null, task != null
    //Effects: assigns a task to the user
    public void assignTask(User user, Task task){
        user.addTask(task);
    }

    //Requires: user != null, task != null
    //Effects: removes a task from the user's task list
    public void removeTask(User user, Task task){
        user.getTasks().remove(task);
    }

    //Requires: user != null
    //Effects: returns all tasks assigned to the user
    public List<Task> listTasks(User user){
        return user.getTasks();
    }
}
