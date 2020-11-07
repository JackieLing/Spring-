package tongzhi;

public class PersonImpl implements Person {
    /*
    * 实现接口方法
    * */
    @Override
    public void add() {
        System.out.println("add>>>");
    }

    @Override
    public void update() {
        System.out.println("update>>>");
    }

    @Override
    public void delete() {
        System.out.println("delete>>>");
    }
}
