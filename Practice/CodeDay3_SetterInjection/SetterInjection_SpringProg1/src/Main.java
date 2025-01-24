import com.nit.config.AppConfig;
import com.nit.sbeans.DatePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        DatePrinter date = ctx.getBean( DatePrinter.class);
        date.printDate();
//        ctx.close();
    }
}