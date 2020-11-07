package aop;

public class EmpServiceImpl implements EmpService {
    @Override
    public void save(String name) {
        System.out.println("当前执行方法的名称：save");//这个相当于冗余代码
        System.out.println("处理业务逻辑saveDAO~~"+name);
    }

    @Override
    public String find(String name) {
        System.out.println("当前执行方法的名称：find");//这个相当于冗余代码
        System.out.println("处理业务调用findDAO~~"+name);
        return name;
    }
}
