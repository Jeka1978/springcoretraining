package never_use_switch;

import com.sun.deploy.xml.XMLParser;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@ComponentScan
public class Conf {


   @Bean
   @Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
   public XMLParser xmlParser(){
       return new XMLParser("");
   }







    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Conf.class);
    }
}
