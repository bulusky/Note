package com.springMVC.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyInterceptor implements HandlerInterceptor {
    /**
     * 预处理，controller方法执行前
     * return true ： 放行，执行下一个拦截器，没有则执行controller
     * retur flase：放行
     *
     * @param request
     * @param response
     * @param hanndler
     * @return
     * @throws Exception
     */
    public boolean perHandle(HttpServletRequest request, HttpServletResponse response, Object hanndler) throws Exception {
        System.out.println("拦截器执行了。。。。。。。前111");
        return true;
    }

    /**
     * 后处理方法：controller后执行
     *
     * @param request
     * @param response
     * @param hanndler
     * @return
     * @throws Exception
     */
    public boolean postHandle(HttpServletRequest request, HttpServletResponse response, Object hanndler) throws Exception {
        System.out.println("拦截器执行了。。。。。。。后111");
        return true;
    }

    /**
     * jsp页面后执行
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器执行了。。。。。。。后111");

    }
}
