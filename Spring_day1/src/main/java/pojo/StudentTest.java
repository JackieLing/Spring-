package pojo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
       ApplicationContext Context = new ClassPathXmlApplicationContext("/init/init.xml");
        StudentImpl student = (StudentImpl) Context.getBean("student");
        System.out.println(student.toString());
    }
}
