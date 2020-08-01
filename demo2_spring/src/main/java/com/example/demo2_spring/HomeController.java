package com.example.demo2_spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//处理器  这个注解会把下边这个类自动扫描注入，形成spring上下文的bean
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";//返回视图名
    }

}
