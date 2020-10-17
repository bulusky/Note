package com.spring.ui;

import com.spring.bean.User;
import com.spring.sercice.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StartTest {

    @Test
    public void Start(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        List<User> list = userService.getAll();
        System.out.println(list.get(0));

    }
}
