
package com.bernardomg.example.spring_mvc_thymeleaf_maven_archetype_example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceConfig {

    public PersistenceConfig() {
        super();
    }

}
