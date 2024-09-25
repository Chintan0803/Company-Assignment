import java.util.List;

public class TaskConflictObserver {
    public boolean hasConflict(Task newTask, List<Task> tasks) {
        for (Task task : tasks) {
            if (newTask.getStartTime().isBefore(task.getEndTime()) &&
                    newTask.getEndTime().isAfter(task.getStartTime())) {
                LoggerUtility.log("Conflict detected: " + newTask + " with " + task);
                return true;
            }
        }
        return false;
    }
}
