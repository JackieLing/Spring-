package init;

public class ClazzDaoImpl implements ClazzDao {
    @Override
    public void delete(String id) {
        System.out.println("Dao层id:"+id);
    }
}
