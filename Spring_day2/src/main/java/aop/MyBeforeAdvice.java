package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//自定义记录业务方法名称的前置通知  前置通知：目标方法执行前先执行的额外操作

public class MyBeforeAdvice implements MethodBeforeAdvice {
    //before：参数1：当前执行的方法对象  参数2：当前执行方法的参数  参数3：目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("当前执行方法"+method.getName());
        /*System.out.println("当前执行方法参数"+args[0]);
        System.out.println("目标对象"+target);*/
    }
}
