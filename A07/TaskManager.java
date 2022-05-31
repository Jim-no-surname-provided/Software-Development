public class TaskManager {
    static final int MAX_TASK_CAPACITY = 15;
    Task[] tasks;
    int nTasks = 0;

    public TaskManager() {
        tasks = new Task[MAX_TASK_CAPACITY];
    }

    public boolean addTask(Task task) {
        if (nTasks >= tasks.length)
            return false;

        tasks[nTasks] = task;
        nTasks++;
        return true;
    }

    public boolean executeTask(int taskNr) {
        if (taskNr >= nTasks || taskNr < 0)
            return false;

        tasks[taskNr].execute();
        return true;
    }

    public void print(){
        Out.println(String.format("%s tasks registred: ", nTasks));
        for (int i = 0; i < nTasks; i++) {
            Out.println(tasks[i]);
        }
    }
}
