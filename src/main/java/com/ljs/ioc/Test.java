package com.ljs.ioc;

import com.ljs.ioc.configuration.BeanConfiguration;
import com.ljs.ioc.configuration.GlobalConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liujs
 * @version 1.0
 * @date 2022/11/15 0015 21:09
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ljs.ioc");
        System.out.println(context.getBean(Dataconfig.class));
        System.out.println(context.getBean(GlobalConfig.class));
        System.out.println("-----------------");

    }
}
