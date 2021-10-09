package strategy;

import java.util.Comparator;
import java.util.List;

import employee.Message;

public class AscendingSortStrategy implements SortStrategy {
    @Override
    public void sort(List<Message> messages) {
        messages.sort(new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                if (o1.getNotificationTime().isAfter(o2.getNotificationTime())) {
                    return 1;
                } else if (o1.getNotificationTime().isBefore(o2.getNotificationTime())) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
