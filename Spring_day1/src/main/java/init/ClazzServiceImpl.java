package init;

public class ClazzServiceImpl implements ClazzService {
    /*  DI：dependcy injection 依赖注入
    * 1.依赖ClazzDao组件对象【需要谁，依赖谁，就将那个组件声明为成员变量】
    * 2.为依赖组件赋值的过程称为依赖注入，注入时要为这个成员变量提供一个set方法
    * */
    private ClazzDao clazzDao;//这里没有赋值

    public void setClazzDao(ClazzDao clazzDao) {
        this.clazzDao = clazzDao;
    }

    @Override
    public void delete(String id) {
        System.out.println("Service层id"+id);
        clazzDao.delete("20");
    }
}
