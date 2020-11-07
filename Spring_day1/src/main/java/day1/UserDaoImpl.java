package day1;

public class UserDaoImpl implements UserDao {
    @Override
    public void find(String name) {
        System.out.println("姓名"+name);
    }
}
