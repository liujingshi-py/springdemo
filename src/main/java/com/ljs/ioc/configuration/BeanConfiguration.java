package com.ljs.ioc.configuration;

import com.ljs.ioc.Dataconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liujs
 * @version 1.0
 * @date 2022/11/15 0015 21:28
 */


public class BeanConfiguration {

    @Bean(name = "config")
    public Dataconfig dataconfig() {
        Dataconfig dataconfig = new Dataconfig();
        dataconfig.setDriverName("Driver");
        dataconfig.setUrl("localhost");
        dataconfig.setUserName("root");
        dataconfig.setPassword("123456");
        return dataconfig;
    }
}
