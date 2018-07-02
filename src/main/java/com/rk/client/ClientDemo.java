package com.rk.client;

import com.rk.beanConifg.Employee;
import com.rk.beans.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee employee=applicationContext.getBean(Employee.class);
        System.out.println(employee);
    }
}
