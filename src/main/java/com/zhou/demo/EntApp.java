package com.zhou.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 14:15 2017/6/26
 */
@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@MapperScan("com.zhou.demo.mapper")
public class EntApp {
    public static void main(String[] args) {
        SpringApplication.run(EntApp.class, args);
    }
}
