package com.sxg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootAtguiguApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAtguiguApplication.class, args);
    }

}
