package com.db.td.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@ComponentScan("com")
@ImportResource(value = {"classpath:/spring/applicationContext.xml"})
@PropertySources({
        @PropertySource(value = "classpath:/conf/conf.properties"),
        @PropertySource(value = "classpath:/conf/important.properties"),
})

@EnableConfigurationProperties()
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
