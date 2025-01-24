import com.nit.config.AppConfig;
import com.nit.sbeans.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee bean = ctx.getBean(Employee.class);
        bean.setId(101);
        bean.setName("Dipali");
        bean.empDetails();
    }
}