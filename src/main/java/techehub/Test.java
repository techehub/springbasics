package techehub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car c1 = (Car)context.getBean("altoVxi");
        System.out.println(c1.fl.size);


    }

}
