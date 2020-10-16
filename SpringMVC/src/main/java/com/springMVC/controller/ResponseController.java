package com.springMVC.controller;


import com.springMVC.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 响应参数
 */
@Controller
@RequestMapping("/response")
public class ResponseController {
    /**
     * 返回值类型为String
     *
     * @return
     */
    @RequestMapping("/one")
    public String one(Model model) {
        User user = new User();
        user.setUsername("我");
        user.setPassword("122");
        model.addAttribute("user", user);//存到request域中
        return "nine";
    }

    /**
     * 含有默认当前路径的页面
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/two")
    public void two(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //转发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        //重定向
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        //直接响应，通过输出流
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        response.getWriter().println("hello");
        return;//不想后面代码执行
    }

    /**
     * ModelAndView
     *
     * @return
     */
    public ModelAndView three() {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("我");
        user.setPassword("122");
        mv.addObject("", user);//存入数据
        mv.setViewName("success");//跳转页面
        return mv;
    }

    /**
     * forward、redirect
     *
     * @return
     */
    @RequestMapping("/four")
    public String four() {
        //请求的转发
        //return "forward:/WEB-INF/pages/success.jsp";
        //请求的重定向
        return "redirect:/index";

    }

    /**
     * json数据
     * 想要将串转出对象或者对象转换为json，需要3个jar包
     *
     * @param
     */
    @RequestMapping("/five")
    public @ResponseBody
    User five(@RequestBody User user) {
        //客户端发送的是json串，后端已经封装
        System.out.println(user);
        user.setUsername("haha");
        user.setPassword("456");
        //ResponseBody帮忙将对象转换为json
        return user;
    }


}
