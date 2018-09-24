package com.xiaomaigou.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用@SpringBootApplication注解来标识该类为启动类:
//@SpringBootApplication其实就是以下三个注解的总和
//@Configuration： 用于定义一个配置类
//@EnableAutoConfiguration ：Spring Boot会自动根据你jar包的依赖来自动配置项目。
//@ComponentScan： 告诉Spring 哪个packages 的用注解标识的类 会被spring自动扫描并且装入bean容器。
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
