package com.ljs.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liujs
 * @version 1.0
 * @date 2022/11/15 0015 21:06
 */

@Data
@Component
public class Dataconfig {

    @Value("localhost")
    private String url;
    private String driverName;
    private String userName;
    private String password;
}
