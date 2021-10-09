package employee;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Message {
    private String content;
    private LocalDateTime notificationTime;

    /*
    @AllArgsConstructor
     public Message(String content, LocalDateTime notificationTime) {
        this.content = content;
        this.notificationTime = notificationTime;
    }
    */
}
