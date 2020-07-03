package com.example.sql;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;


@Slf4j
@SpringBootApplication
public class SqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlApplication.class, args);
    }

    @Bean
    public ApplicationRunner start(SqlProperties properties) {
        return args -> {
            log.info(getContent(properties.getFile1()));
            log.info(getContent(properties.getFile2()));
        };

    }


    @SneakyThrows
    private static String getContent(Resource r) {
        return StreamUtils.copyToString(r.getInputStream(), StandardCharsets.UTF_8);
    }


}
