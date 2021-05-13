package com.buptse.dismancen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description  启动类
 * @Author ASJA
 * @Date 2021/5/12 15:54
 * @Version 1.0
 */

@SpringBootApplication
@MapperScan(value = "com.buptse.dismancen.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
