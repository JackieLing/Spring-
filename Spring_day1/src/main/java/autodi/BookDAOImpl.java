package autodi;

public class BookDAOImpl implements BookDAO {
    private BookDAO bookDAO;

    @Override
    public void save() {
        System.out.println("BookDAO invoke~~~");
    }
}
