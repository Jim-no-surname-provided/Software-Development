public class RepeatedStructuredTask extends StructuredTask {
    int nExecutions;

    public RepeatedStructuredTask(String title, String assignee, String[] steps, int nExecutions) {
        super(title, assignee, steps);
        this.nExecutions = nExecutions;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tx" + nExecutions;
    }

    @Override
    public void execute() {
        for (int i = 1; i <= nExecutions; i++) {
            super.execute();
        }
    }
}
