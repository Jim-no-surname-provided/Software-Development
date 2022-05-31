public class Task {
    String title;
    String assignee;

    public Task(String title, String assignee) {
        this.title = title;
        this.assignee = assignee;
    }

    public Task(String title) {
        this(title, "No assignee");
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", title, assignee);
    }

    public void execute() {
        Out.println(String.format("Executing task: %s", this));
    }

}
