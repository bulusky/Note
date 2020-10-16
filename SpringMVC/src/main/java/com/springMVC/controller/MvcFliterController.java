package com.springMVC.controller;


import com.springMVC.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springMVC的异常处理
 */
@Controller
@RequestMapping("/fliter")
public class MvcFliterController {
    public String one() throws Exception {
        //异常演示
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            //打印信息
            e.printStackTrace();
            throw new SysException("查询用户信息错误");
        }
        return "success";
    }
}
