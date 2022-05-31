public class TaskManagerApplicationWithTheTxtInput {
  public static String[] createStepsFromInput() {
    Out.print("# of Steps: ");
    int nSteps = In.readInt();
    Out.println(nSteps);
    In.readLine();
    String[] steps = new String[nSteps];
    for (int i = 0; i < nSteps; i++) {
      Out.print(String.format("Steps %d: ", (i + 1)));
      steps[i] = In.readLine();
      Out.println(steps[i]);
    }
    return steps;
  }

  public static Task createTaskFromInput() {
    Out.println("Creating new task:");
    Out.print("Type ([1] default, [2] structured, [3] repeated): ");
    int type = In.readInt();
    Out.println(type);
    In.readLine();
    String title;
    String assignee;
    switch (type) {
      case 1:
        // Task
        Out.print("Title: ");
        title = In.readLine();
        Out.println(title);
        Out.print("Assignee: ");
        assignee = In.readLine();
        Out.println(assignee);
        return new Task(title, assignee);
      case 2:
        // StructuredTask
        Out.print("Title: ");
        title = In.readLine();
        Out.println(title);
        Out.print("Assignee: ");
        assignee = In.readLine();
        Out.println(assignee);
        return new StructuredTask(title, assignee, createStepsFromInput());
      case 3:
        // RepeatedStructuredTask
        Out.print("Title: ");
        title = In.readLine();
        Out.println(title);
        Out.print("Assignee: ");
        assignee = In.readLine();
        Out.println(assignee);
        String[] steps = createStepsFromInput();
        Out.print("# of executions: ");
        int nExecutions = In.readInt();
        Out.println(nExecutions);
        return new RepeatedStructuredTask(title, assignee, steps, nExecutions);
      default:
        Out.println("Invalid input!");
        return null;
    }
  }

  public static void main(String[] args) {
    In.open("testInformation.txt");

    TaskManager tm = new TaskManager();
    char c;
    do {
      Out.print("Command ([c] create task, [e] execute task, [s] print summary, [q] exit]: ");
      c = In.readChar();
      Out.println(c);
      switch (c) {
        case 'c':
          Task t = createTaskFromInput();
          if (tm.addTask(t)) {
            Out.println("Successfully registered task!");
          } else {
            Out.println("Task list is full!");
          }
          break;
        case 'e':
          Out.print("Task to execute: ");
          int taskNr = In.readInt();
          Out.println(taskNr);
          In.readLine();
          if (tm.executeTask(taskNr)) {
            Out.println(String.format("Task %d successfully executed", taskNr));
          } else {
            Out.println("Could not execute task! Invalid task number " + taskNr);
          }
          break;
        case 's':
          tm.print();
          break;
        case 'q':
          break;
        default:
          Out.println("Invalid command: " + c);
      }
      Out.println();
    } while (c != 'q');

    In.close();

    Out.println("Task manager shutdown");
  }
}
