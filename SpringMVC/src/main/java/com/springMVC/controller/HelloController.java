package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * springMVC入门练习
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    /**
     * 入门程序
     *
     * @return
     */
    @RequestMapping(path = "/sayHello")
    public String sayHello() {
        System.out.println("hello，springMVC");
        return "success";
    }

    /**
     * RequestMapping属性value：路径
     * 只有一个参数时，value可以省略
     *
     * @return
     */
    @RequestMapping("/testRequestMappingValue")
    public String testRequestMapping() {
        return "success";
    }

    /**
     * RequestMapping属性method：指定请求方式
     * GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
     *
     * @return
     */
    @RequestMapping(value = "/testRequestMappingMethod", method = {RequestMethod.POST})
    public String testRequestMappingMethod() {
        return "success";
    }

    /**
     * RequestMapping属性params:指定传递参数
     * 必须传一个名为username的参数
     *
     * @return
     */
    @RequestMapping(value = "/testRequestMappingParams", params = {"username"})
    public String testRequestMappingParams() {
        return "success";
    }

    /**
     * RequestMapping属性header：指定消息头
     *
     * @return
     */
    @RequestMapping(value = "/testRequestMappingHeader", headers = {"Accept"})
    public String testRequestMappingHeader() {
        return "success";
    }
    //属性之间是与的关系
}
