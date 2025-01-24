import com.nit.config.AppConfig;
import com.nit.sbeans.Employee;
import com.nit.sbeans.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!");
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        Employee bean = ctx.getBean(Employee.class);
        EmployeeService bean1 = ctx.getBean(EmployeeService.class);
       bean.setName("Dipali");
       bean.setDepartment("IT");
       bean1.showEmployeeDetails();
    }
}