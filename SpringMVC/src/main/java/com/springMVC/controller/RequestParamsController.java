package com.springMVC.controller;



import com.springMVC.domain.Account;
import com.springMVC.domain.MapperList;
import com.springMVC.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/request")
public class RequestParamsController {
    /**
     * 第一种方式
     *
     * @return
     */
    @RequestMapping("/one")
    public String one(String username, String password) {
        System.out.println("传递了参数：" + username);
        System.out.println("传递了参数：" + password);
        return "success";
    }

    /**
     * 传递的参数自动封装到user中
     *
     * @param user
     * @return
     */
    @RequestMapping("/two")
    public String two(User user) {
        System.out.println("传递了参数：" + user.getUsername());
        return "success";
    }

    /**
     * 封装的对象中有引用类
     *
     * @param account
     * @return
     */
    @RequestMapping("/three")
    public String three(Account account) {
        System.out.println("传递了参数：" + account.getUser().getUsername());
        return "success";
    }

    /**
     * 封装的对象中含有集合
     *
     * @param mapperList
     * @return
     */
    @RequestMapping("/four")
    public String four(MapperList mapperList) {
        System.out.println("传递了参数：" + mapperList.getUserList().get(0).getUsername());
        return "success";
    }

    /**
     * 页面提交的参数全部为Strring类型，有springMVC框架封装为对应的
     * 类型，一般类型都会自动转换
     * 但其中可能因为格式问题报异常
     * 比如日期格式2020-5-27和2020/5/27
     * 需要用到类型转换器
     *
     * @param date
     * @return
     */
    @RequestMapping("/five")
    public String five(Date date) {
        System.out.println("传递了参数：" + date);
        return "success";
    }

    /**
     * 获取servlet的API
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/six")
    public void six(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect(request.getContextPath() + "/success.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
