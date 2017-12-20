package com.fatiger.framework.rest.awares;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author wengjiayu
 * @date 16/12/2017
 * @E-mail wengjiayu521@163.com
 */
@Configuration
public class SpringContextAwareImpl implements ApplicationContextAware {

    private static ApplicationContext ctx = null;

    public static Object getBean(String beanName) {
        return ctx.getBean(beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }
}
