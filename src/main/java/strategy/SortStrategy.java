package strategy;

import java.util.List;

import employee.Message;

public interface SortStrategy {
    void sort(List<Message> messages);
}
