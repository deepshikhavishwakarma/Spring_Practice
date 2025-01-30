import com.nit.config.AppConfig;
import com.nit.sbeans.SortingContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SortingContext bean = ctx.getBean(SortingContext.class);
        int[] arr = {3,5,7,2,4,3,6,1};
        bean.executeSort(arr);


    }
}
