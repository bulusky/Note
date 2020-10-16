package com.ssm.controller;

import com.ssm.bean.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/saveOne")
    public void saveOne(User user){
        userService.saveOne(user);
    }

    @RequestMapping("/getAll")
    public String getAll(Model model){
        System.out.println("11");
        List<User> list = userService.getAll();
        model.addAttribute("list",list);
        System.out.println(list.size());
        return "list";
    }
}
