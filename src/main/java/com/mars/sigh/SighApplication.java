package com.mars.sigh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SighApplication {
    private static final Logger logger = LoggerFactory.getLogger(SighApplication.class.getName());

    public static void main(String[] args) {

        SpringApplication.run(SighApplication.class, args);
        logger.info(">>>>>>>start successi:!<<<<<<<");
    }

}
