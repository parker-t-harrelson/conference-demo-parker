package com.pluralsight.pluralsightdemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {

        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/demo");
        builder.username("postgres");
        builder.password("postgres");
        System.out.println("Custom data source has been initialized and set");

        return builder.build();
    }
}

