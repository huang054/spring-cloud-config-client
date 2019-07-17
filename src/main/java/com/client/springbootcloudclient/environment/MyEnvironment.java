package com.client.springbootcloudclient.environment;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class MyEnvironment  implements PropertySourceLocator {
    @Override
    public PropertySource<?> locate(Environment environment) {
     /*   if (environment instanceof ConfigurableEnvironment) {
             //两种方式一
            ConfigurableEnvironment configurableEnvironment = ConfigurableEnvironment.class.cast(environment);

            // 获取 PropertySources
            MutablePropertySources propertySources = configurableEnvironment.getPropertySources();
            // 定义一个新的 PropertySource，并且放置在首位
            propertySources.addFirst(createPropertySource());

        }*/
     //二
        Map<String,Object> map = new HashMap<>();
        //以9000端口启动
        map.put("server.port",9000);
        MapPropertySource propertySource = new MapPropertySource("mydemo",map);
        return propertySource;
    }
    private PropertySource createPropertySource() {

        Map<String, Object> source = new HashMap<>();

        source.put("spring.application.name", " Spring Cloud 程序");
        // 设置名称和来源
        PropertySource propertySource = new MapPropertySource("over-bootstrap-property-source", source);

        return propertySource;

    }

}
