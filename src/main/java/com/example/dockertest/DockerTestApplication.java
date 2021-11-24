package com.example.dockertest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletContext;

@SpringBootApplication
public class DockerTestApplication {
    private static final Logger logger = LoggerFactory.getLogger(DockerTestApplication.class);

    @Autowired
    private static ServletContext context;

    public static void main(String[] args) {
        logger.info("11111111111111111 {} ", context.getContextPath());

        SpringApplication.run(DockerTestApplication.class, args);

        logger.info("22222222222222222 {} ", context.getContextPath());
    }

}
