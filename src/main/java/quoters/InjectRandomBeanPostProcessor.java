package quoters;

import my_spring.InjectRandomObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomBeanPostProcessor implements BeanPostProcessor {
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        InjectRandomObjectConfigurator configurator = new InjectRandomObjectConfigurator();
        configurator.configure(bean);
        return bean;
    }
}
