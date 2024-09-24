
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScheduleManager {
    private static ScheduleManager instance;
    private final List<Task> tasks;
    private final TaskConflictObserver conflictObserver;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        conflictObserver = new TaskConflictObserver();
    }

    // Singleton instance method
    public static synchronized ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // Method to add a task
    public void addTask(Scanner scanner) {
        System.out.print("Enter Task Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Start Time (HH:MM): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter End Time (HH:MM): ");
        String endTime = scanner.nextLine();
        System.out.print("Enter Priority (High, Medium, Low): ");
        String priority = scanner.nextLine();

        Task newTask = TaskFactory.createTask(description, startTime, endTime, priority);
        if (conflictObserver.hasConflict(newTask, tasks)) {
            System.out.println("Error: Task conflicts with existing task.");
        } else {
            tasks.add(newTask);
            LoggerUtility.log("Task added successfully: " + newTask);
            System.out.println("Task added successfully. No conflicts.");
        }
    }

    // Method to remove a task
    public void removeTask(Scanner scanner) {
        System.out.print("Enter Task Description to Remove: ");
        String description = scanner.nextLine();
        Task taskToRemove = tasks.stream()
                .filter(t -> t.getDescription().equalsIgnoreCase(description))
                .findFirst()
                .orElse(null);

        if (taskToRemove == null) {
            System.out.println("Error: Task not found.");
        } else {
            tasks.remove(taskToRemove);
            LoggerUtility.log("Task removed: " + taskToRemove);
            System.out.println("Task removed successfully.");
        }
    }

    // Method to view all tasks sorted by start time
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
            return;
        }

        tasks.stream()
                .sorted((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()))
                .forEach(System.out::println);
    }
}
