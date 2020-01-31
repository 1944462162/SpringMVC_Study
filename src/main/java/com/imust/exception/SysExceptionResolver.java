package com.imust.exception;

/**
 * Author: wangJianBo
 * Date: 2020/1/31 16:57
 * Content:
 */

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 如果Controller存在异常将会调用这个异常处理器
 * 异常的处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        //将其转变为自定义异常
        SysException sysException = null;
        if (ex instanceof SysException){
            sysException = (SysException)ex;
        }
        else{
            sysException = new SysException("系统正在处理异常信息");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMsg",sysException.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
