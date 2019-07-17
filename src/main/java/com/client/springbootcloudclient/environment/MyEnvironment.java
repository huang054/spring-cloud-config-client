package com.client.springbootcloudclient.environment;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class MyEnvironment  implements PropertySourceLocator {
    @Override
    public PropertySource<?> locate(Environment environment) {
        Map<String,Object> map = new HashMap<>();
        //以9000端口启动
        map.put("server.port",9000);
        MapPropertySource propertySource = new MapPropertySource("mydemo",map);
        return propertySource;
    }


}
