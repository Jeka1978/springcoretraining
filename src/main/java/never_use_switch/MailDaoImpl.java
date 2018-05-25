package never_use_switch;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Repository
public class MailDaoImpl implements MailDao {
    @Override
    public MailInfo getMailInfo() {
        Random random = new Random();
        return new MailInfo(random.nextInt(3) + 1);
    }
}
