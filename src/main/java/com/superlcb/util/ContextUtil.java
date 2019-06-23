package com.superlcb.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextUtil<T> implements ApplicationContextAware {
    public static ApplicationContext context=null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context=applicationContext;
    }
    public static<T> T getBean(String beanName,Class<T> tClass){
        return context.getBean(beanName,tClass);
    }
}
