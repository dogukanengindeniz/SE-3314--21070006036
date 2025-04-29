import java.time.LocalDate;

public class Task {

    private String title;
    private LocalDate dueDate;
    private boolean isCompleted;

    //Requires: title!= null, dueDate != null
    //Effects: initializes task with given title and due date

    public Task(String title, LocalDate dueDate, boolean isCompleted) {
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    //Requires: none
    //Effects: returns true if task is past due date and not completed
    public boolean isOverdue(){
        return !isCompleted && LocalDate.now().isAfter(dueDate);
    }
}
