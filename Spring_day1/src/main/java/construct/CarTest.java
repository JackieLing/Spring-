package construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("/init/init.xml");
        Car car = (Car) Context.getBean("car");
        System.out.println(car.toString());
    }
}
