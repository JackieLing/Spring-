package day1;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao.find("小黑");
    }
}
