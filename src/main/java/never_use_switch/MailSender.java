package never_use_switch;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
//@Scope("prototype")
@Profile("PROD")
//spring.profiles.active = PROD

public class MailSender {
    @Autowired
    private MailDao mailDao;

    @Autowired
    private Map<String,MailGenerator> map;

    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        MailInfo mailInfo = mailDao.getMailInfo();
        String code = String.valueOf(mailInfo.getCode());
        MailGenerator mailGenerator = map.get(code);
        String html= mailGenerator.generateHtml(mailInfo);
        send(html);


    }

    private void send(String html) {
        System.out.println("html = " + html);
    }

}




