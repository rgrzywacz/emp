package task;

import observer.TaskPublisher;

public class TaskService {

    private TaskPublisher taskPublisher; //instancja przekazana z konstruktora

    public TaskService(TaskPublisher taskPublisher) {
        this.taskPublisher = taskPublisher;
    }

    public Task createTask(String title, String description, TaskPriority taskPriority) {
        Task task = new Task(title, description, taskPriority);
        if (TaskPriority.CRITICAL.equals(taskPriority)) {
            taskPublisher.notifyObservers(task);
        }
        return task;
    }
}
