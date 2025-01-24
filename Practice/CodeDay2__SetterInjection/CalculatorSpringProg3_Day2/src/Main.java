import com.nit.config.AppConfig;
import com.nit.sbeans.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        System.out.println("Hello world!")

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculator calc = ctx.getBean("calc", Calculator.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter Value of b : ");
        int b = sc.nextInt();
        boolean abc = true;
        while (abc){
            System.out.println("Enter your choice : \n  1).Addition\n   2).Subtraction\n    3)Multiplication\n  4)Division\n    5)Exit");
            int choice = sc.nextInt();
            switch (choice) {
              case 1:
                  System.out.println("Addition is : "+calc.add(a,b));
                  break;
              case 2:
                  System.out.println("Subtraction is : "+calc.subtract(a,b));
                  break;
              case 3:
                  System.out.println("Multiplication is :"+calc.multiply(a,b));
                  break;
              case 4:

//                      try {
                          System.out.println("Division is "+calc.divide(a,b));

//                      }catch (ArithmeticException e){
//                          System.err.println("Value should be greater than 0"+e);
////                          e.getMessage();
//                      }


                  break;
              case 5:
                  abc=false;
                  System.exit(0);
              default:
                  System.out.println("Invalid Choice");
          }
        }


    }
}