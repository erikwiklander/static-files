package com.example.sql;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("sql")
public class SqlProperties {
    private Resource file1;
    private Resource file2;
}
