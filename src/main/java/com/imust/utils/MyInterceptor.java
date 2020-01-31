package com.imust.utils;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: wangJianBo
 * Date: 2020/1/31 17:40
 * Content: 自定义拦截器
 */

public class MyInterceptor implements HandlerInterceptor {
    /**
     * 当返回值是true表示放行，返回值是false的话表示拦截
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle方法执行了");
        return true;
    }
}
