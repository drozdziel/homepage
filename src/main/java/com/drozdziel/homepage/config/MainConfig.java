package com.drozdziel.homepage.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Piotr Droździel on 7/26/15.
 */
@SpringBootApplication
@EnableWebMvc
@EnableJpaAuditing
@EntityScan(basePackages = "com.drozdziel.homepage.domain")
@EnableJpaRepositories(basePackages = "com.drozdziel.homepage.repository")
public class MainConfig {
    public static void main(String[] args) {
        SpringApplication.run(MainConfig.class, args);
    }
}
