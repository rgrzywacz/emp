package strategy;

import java.util.List;

import employee.Message;

public class SortService {

    private SortStrategy ascendingSortStrategy;
    private SortStrategy descendingSortStrategy;

    public SortService() {
        this.ascendingSortStrategy = new AscendingSortStrategy();
        this.descendingSortStrategy = new DescendingSortStrategy();
    }

    public void sortMessages(SortType sortType, List<Message> messages) {
        if (SortType.ASC.equals(sortType)) {
            ascendingSortStrategy.sort(messages);
        } else if (SortType.DESC.equals(sortType)) {
            descendingSortStrategy.sort(messages);
        } else {
            throw new IllegalArgumentException("sort type can not be null");
        }
    }
}
