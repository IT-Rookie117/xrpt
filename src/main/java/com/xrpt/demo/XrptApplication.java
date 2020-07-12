package com.xrpt.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.xrpt.demo.*"})
@MapperScan("com.xrpt.demo.dao")
public class XrptApplication {
    public static void main(String[] args) {
        SpringApplication.run(XrptApplication.class, args);
    }

}
