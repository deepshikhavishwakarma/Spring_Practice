import com.nit.com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        WishMessageGenerator bean = ctx.getBean(WishMessageGenerator.class);
        System.out.println(bean.generateWishMessage());
        ctx.close();
    }
}