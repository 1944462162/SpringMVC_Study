package com.imust.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: wangJianBo
 * Date: 2020/1/30 11:22
 * Content:
 */

@Controller
public class HelloController {

    /**
     * @RequestMapping注解说明：
     *      value: 用于指定请求的URL。他和path的属性的作用是一样的
     *      method：用于指定请求的方式
     *      params: 用于指定限制请求参数的条件，要求请求参数的key和value一致（用的较少）
     * @return
     */
    @RequestMapping(value = "/hello",method = {RequestMethod.GET},params = {"username=hehe"})
    public String SayHello(){
        System.out.println("hello");
        return "success";
    }
}
