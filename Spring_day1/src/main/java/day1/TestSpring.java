package day1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //启动工厂
        ApplicationContext context=new ClassPathXmlApplicationContext("day1/day1.xml");

        //获取工厂中的对象,还要进行强制转换一下
        UserDao userDao = (UserDao) context.getBean("bb");

        //使用对象
        userDao.find("小明");
    }

}
