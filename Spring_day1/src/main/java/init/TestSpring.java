package init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //启动工厂
       ApplicationContext Context = new ClassPathXmlApplicationContext("init/init.xml");
        //获取组件实例
        /*ClazzDao clazzDao = (ClazzDao) Context.getBean("clazzDao");

        clazzDao.delete("25");*/

        ClazzService clazzService = (ClazzService) Context.getBean("clazzService");

        clazzService.delete("26");

    }
}
