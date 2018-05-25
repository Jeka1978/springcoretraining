package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Evgeny Borisov
 */
public class TerminatorQuoter implements Quoter {

    @Setter
    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] message) {
        this.messages = Arrays.asList(message);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void killAll() {
        System.out.println("you are terminated");
    }













}
