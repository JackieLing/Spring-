package autodi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("/autodi/autodi.xml");
        BookDAO bookDAO = (BookDAO) Context.getBean("bookDAO");
        bookDAO.save();
    }
}
