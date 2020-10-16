package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;

/**
 * 常用注解
 */
@Controller
@SessionAttributes(value = {"msg"})//相当于把信息存入session
@RequestMapping("/annotation")
public class AlwaysAnnotationController {
    /**
     * @param name
     * @param password
     * @return
     * @RequestParam:用于对于参数名称不一样的转换 必须有且名称为username的参数
     */
    @RequestMapping("/one")
    public String one(@RequestParam(name = "username") String name, Integer password) {
        System.out.println(name + password);
        return "success";
    }

    /**
     * @return
     * @RequestBody:获取请求体的内容 get情趣不适用
     */
    @RequestMapping("/two")
    public String two(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable用于绑定URL中的占位符/delete/{id}
     * 是支持spring3.0的重要表现
     *
     * @return resultful编程风格 ：
     * 方法不加路径，用不同的请求方式区分
     */
    @RequestMapping("/three/{id}")
    public String three(@PathVariable String id) {
        System.out.println();
        return "success";
    }

    /**
     * formB表单只支持post和get方式
     * 使用HiddentHttpMethodFilter可以将浏览器请求改为指定的方式
     * 使用方法：
     * 1、在web.xml中配置顾虑器
     * 2、请求方式必须为post
     * 3、按要求提供_method请求参数，值为需要的情求方式
     */
    @RequestMapping(value = "/four", method = RequestMethod.PUT)
    public String four() {
        System.out.println();
        return "success";
    }

    /**
     * RequestHeader:获取消息头
     *
     * @param header
     * @return
     */
    @RequestMapping("/five")
    public String five(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);
        return "success";
    }

    /**
     * @param cookieValue
     * @return
     * @cookieValue:获取cookie的值
     */
    @RequestMapping("/six")
    public String six(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * @return
     * @ModelAttribute: 放在方法上：表示该方法会在控制器执行前先执行
     * 放在参数上：获取指定的数据给参数赋值
     */
    @ModelAttribute
    public String seven() {
        System.out.println("@ModelAttribute：我先执行啦");
        return "success";
    }

    @RequestMapping("/eight")
    public String eight(String username, @ModelAttribute(name = "date") Date date) {
        System.out.println(date);
        return "success";
    }

    /**
     * SessionAttributes:实现控制器间的数据共享
     * 只能作用于类上
     *
     * @return
     */
    @RequestMapping("/nine")
    public String nine(Model model) {
        model.addAttribute("msg", "共享信息");
        System.out.println();
        return "nine";
    }

    @RequestMapping("/ten")
    public String ten(ModelMap modelMap) {
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "nine";
    }

    @RequestMapping("/eleven")
    private void delete(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
    }


}
