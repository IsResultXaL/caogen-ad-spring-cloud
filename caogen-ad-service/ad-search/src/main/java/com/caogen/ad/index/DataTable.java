package com.caogen.ad.index;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-01 17:41
 */
@Component
public class DataTable implements ApplicationContextAware, PriorityOrdered {

    private static ApplicationContext applicationContext;

    public static final Map<Class, Object> dataTableMap = new ConcurrentHashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        DataTable.applicationContext = applicationContext;
    }

    @Override
    public int getOrder() {
        return PriorityOrdered.HIGHEST_PRECEDENCE;
    }

    public static <T> T of(Class<T> tClass) {
        T instance = (T) dataTableMap.get(tClass);
        if (null != instance) {
            return instance;
        }

        dataTableMap.put(tClass, bean(tClass));
        return (T) dataTableMap.get(tClass);
    }

    private static <T> T bean(String beanName) {
        return (T) applicationContext.getBean(beanName);
    }

    private static <T> T bean(Class c) {
        return (T) applicationContext.getBean(c);
    }
}
