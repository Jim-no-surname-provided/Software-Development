public class StructuredTask extends Task {
    String[] steps;

    public StructuredTask(String title, String assignee, String... steps) {
        super(title, assignee);
        this.steps = steps;
    }

    public StructuredTask(String title, String... steps) {
        super(title);
        this.steps = steps;
    }

    @Override
    public String toString() {
        StringBuilder stBuilder = new StringBuilder();
        for (String step : steps) {
            stBuilder.append("\n\t-" + step);
        }

        return super.toString() + ":" + stBuilder.toString();
    }

}
