import com.nit.config.AppConfig;
import com.nit.sbeans.Address;
import com.nit.sbeans.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Student bean = ctx.getBean(Student.class);
        bean.setName("Dipali");bean.setRollNumber(12345);

        Address bean1 = ctx.getBean(Address.class);
        bean1.setCity("Bhopal");bean1.setState("MP");
        bean.dispStudentDetails();
        ctx.close();
    }
}