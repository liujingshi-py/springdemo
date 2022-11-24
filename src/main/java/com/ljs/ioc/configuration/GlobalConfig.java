package com.ljs.ioc.configuration;

import com.ljs.ioc.Dataconfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author liujs
 * @version 1.0
 * @date 2022/11/15 0015 22:06
 */

@Data
@Component
public class GlobalConfig {

    @Value("8848")
    private String port;

    @Autowired//通过类型注入
    private Dataconfig dataconfig;
}
