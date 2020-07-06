package com.example.sql;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@Slf4j
@SpringBootApplication
public class SqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlApplication.class, args);
    }

    @Bean
    public ApplicationRunner start(@Qualifier("file1") String s1, @Qualifier("file2") String s2) {
        return args -> {
            log.info(s1);
            log.info(s2);
        };

    }

}
