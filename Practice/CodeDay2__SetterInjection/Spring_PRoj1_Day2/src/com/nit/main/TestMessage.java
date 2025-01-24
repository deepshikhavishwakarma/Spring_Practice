package com.nit.main;

import com.nit.config.AppConfig;
import com.nit.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMessage {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService msg = ctx.getBean("msg", MessageService.class);
        msg.printMessage();

    }
}
