import com.nit.Config.AppConfig;
import com.nit.sbeans.ConcreteVehicleFactory;
import com.nit.service.VehicleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        VehicleService factory = ctx.getBean(VehicleService.class);
        factory.displayVehicle();
    }
}
