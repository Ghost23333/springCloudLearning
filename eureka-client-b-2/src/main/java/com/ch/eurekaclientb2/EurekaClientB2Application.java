package com.ch.eurekaclientb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientB2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientB2Application.class, args);
    }

}
