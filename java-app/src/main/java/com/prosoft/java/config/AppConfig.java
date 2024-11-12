package com.prosoft.java.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.prosoft.java", "com.prosoft.kotlin"})
public class AppConfig {

}
