package com.perfect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.perfect.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        // 逆向工程测试
        SpringApplication.run(DemoApplication.class, args);
    }

}
