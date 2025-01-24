import com.nit.config.AppConfig;
import com.nit.sbeans.DiscountCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        DiscountCalculator bean = ctx.getBean(DiscountCalculator.class);
        System.out.println("Total Price : "+bean.calculateDiscount(100));
    }
}