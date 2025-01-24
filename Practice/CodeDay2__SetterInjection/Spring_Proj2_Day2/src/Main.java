import com.nit.config.AppConfig;
import com.nit.sbeans.Greeting;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!");
         AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         Greeting great = ctx.getBean("great", Greeting.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name ");
        String name=sc.nextLine();
         great.greetUser("Dipali");
         great.greetUser(name);
    }
}