package task;

public class TaskService {

    public TaskService() {
    }

    public Task createTask(String title, String description, TaskPriority taskPriority) {
        Task task = new Task(title, description, taskPriority);
        return task;
    }
}
