package com.prosoft.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// в config! @ComponentScan(basePackages = {"com.prosoft.java", "com.prosoft.kotlin"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
