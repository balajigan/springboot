package com.test.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class MainClass 
{
private static final Logger logger = LogManager.getLogger(MainClass.class);
    public static void main(String[] args) {

	        logger.debug("Debugging log");
	            logger.info("Info log");
	            logger.warn("Hey, This is a warning!");
	        logger.error("Oops! We have an Error. OK");
            logger.fatal("Damn! Fatal error. Please fix me.");

        ApplicationContext ctx = SpringApplication.run(MainClass.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
