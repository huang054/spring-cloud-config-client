package com.client.springbootcloudclient.environment;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.*;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment= configurableApplicationContext.getEnvironment();
        MutablePropertySources sources=environment.getPropertySources();
        sources.addFirst(createPropertySource());
    }
    private PropertySource createPropertySource() {

        Map<String, Object> source = new HashMap<>();

        source.put("spring.application.name", " Spring Cloud 程序");
        // 设置名称和来源
        PropertySource propertySource = new MapPropertySource("over-bootstrap-property-source", source);

        return propertySource;

    }
}
