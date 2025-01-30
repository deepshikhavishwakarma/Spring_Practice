import com.nit.config.AppConfig;
import com.nit.sbeans.AllClasses.ConcreteBankFactory;
import com.nit.sbeans.AllClasses.Customer;
import com.nit.sbeans.Interfaces.BankFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Customer bean1 = ctx.getBean(Customer.class);
        bean1.setCustomerId(101);
        bean1.setCustomerName("Dipali");
        bean1.setBank("SBI");
        bean1.deposit(200000);
        bean1.withdraw(2000);
        bean1.displayDetails();


    }
}
