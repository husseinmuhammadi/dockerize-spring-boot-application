package com.javastudio.tutorial.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ApplicationReadyListener {
    private final Logger logger = LoggerFactory.getLogger(ApplicationReadyListener.class);

    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent event) {
        ConfigurableApplicationContext applicationContext = event.getApplicationContext();
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(logger::info);
    }
}

