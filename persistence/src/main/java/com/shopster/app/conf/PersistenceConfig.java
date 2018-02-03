package com.shopster.app.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.shopster.app.repository")
@EntityScan("com.shopster.app.entity")
public class PersistenceConfig{

    public static void main(String[] args) {
        SpringApplication.run(PersistenceConfig.class, args);
    }

}
