package quoters;

import lombok.Setter;
import my_spring.InjectRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
    private String message;
    @InjectRandom(min = 3,max = 7)
    private int repeat;


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {

            System.out.println(message);
        }
    }
}
