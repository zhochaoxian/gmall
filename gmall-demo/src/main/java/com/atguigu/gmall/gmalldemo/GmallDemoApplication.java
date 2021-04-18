package com.atguigu.gmall.gmalldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.atguigu.gmall")
public class GmallDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallDemoApplication.class, args);
    }

}
