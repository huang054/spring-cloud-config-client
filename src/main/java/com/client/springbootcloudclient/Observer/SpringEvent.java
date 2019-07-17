package com.client.springbootcloudclient.Observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEvent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.addApplicationListener((ApplicationListener<MyEvent>) applicationEvent -> System.out.println(applicationEvent.getSource()));
        context.refresh();
        context.publishEvent(new MyEvent("hello"));

    }
    public static  class  MyEvent extends ApplicationEvent{

        public MyEvent(Object source) {
            super(source);
        }
    }
}
