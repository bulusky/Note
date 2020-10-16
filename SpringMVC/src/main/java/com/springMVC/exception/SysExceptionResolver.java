package com.springMVC.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 自定义异常处理逻辑
     *
     * @param request：
     * @param response：
     * @param handler：
     * @param ex：当前抛出的异常对象
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //获取异常对象
        SysException e = null;
        if (e instanceof SysException) {
            e = (SysException) ex;
        } else {
            e = new SysException("系统正在维护");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", e.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
