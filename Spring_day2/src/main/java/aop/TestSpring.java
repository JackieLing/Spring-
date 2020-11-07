package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("aop/spring.xml");
        EmpService empService = (EmpService) Context.getBean("empService");
        //empService.save("小陈");
        System.out.println(empService.getClass());
    }
}
