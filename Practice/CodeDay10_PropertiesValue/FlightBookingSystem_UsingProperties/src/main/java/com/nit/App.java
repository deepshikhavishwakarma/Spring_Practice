package com.nit;

import com.nit.config.AppConfig;
import com.nit.sbeans.Address;
import com.nit.sbeans.Flight;
import com.nit.sbeans.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Flight bean1 = ctx.getBean(Flight.class);
        System.out.println(bean1.toString());
        User bean2 = ctx.getBean(User.class);
       System.out.println(bean2.toString());
//        Address bean3 = ctx.getBean(Address.class);
//         System.out.println(bean3.toString()+" "+bean3.getCity());
    }
}
