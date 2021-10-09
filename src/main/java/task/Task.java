package task;

import lombok.Data;

@Data
public class Task {
    private static Long counter = 1L;
    private Long id;

    private String title;
    private String description;
    private TaskPriority taskPriority;

    public Task() {
        this.id = counter++;
    }

    public Task(String title, String description, TaskPriority taskPriority) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.taskPriority = taskPriority;
    }
}
