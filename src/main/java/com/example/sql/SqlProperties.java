package com.example.sql;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;

@Getter
@Setter
@Component
@ConfigurationProperties("sql")
public class SqlProperties {
    private Resource file1;
    private Resource file2;

    @Bean
    public String file1() {
        return getContent(file1);
    }
    @Bean
    public String file2() {
        return getContent(file2);
    }

    @SneakyThrows
    private static String getContent(Resource r) {
        return StreamUtils.copyToString(r.getInputStream(), StandardCharsets.UTF_8);
    }

}
