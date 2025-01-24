package com.nit.main;

import com.nit.sbeans.WishMessageGenerator;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/cfgs/applicationContext.xml");
      Object obj = ctx.getBean("wmg");
        WishMessageGenerator generator = (WishMessageGenerator) obj;
    String result = generator.generateWishMessage("Deep");
        System.out.println(result);
        ctx.close();
        System.out.println("DependencyInjectionTest,main()(end)");
    }
}
