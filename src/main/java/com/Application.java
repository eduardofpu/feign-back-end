package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {
    public static void main(String[] args) { //localhost:8080/v1/cep/38410230
        SpringApplication.run(Application.class,args);

    }
}
