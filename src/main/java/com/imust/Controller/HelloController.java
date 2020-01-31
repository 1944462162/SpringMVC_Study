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
     * 搭建SpringMVC环境的步骤：
     *  1.创建web.xml文件，搭建前端控制器，定义初始化加载文件，加载springmvc的xml配置文件
     *  2.在springMVC的配置文件中开启扫描包，配置视图解析器
     *  3.创建响应的Java类并创建映射对象
     *  4.编写index.xml文件
     */

    /**
     * springMVC的执行流程：
     *  1.首相加载index.xml文件，当点击超链接或者提交表单时
     *  2.触发前端控制器（相当于一个指挥中心）
     *  3.进入处理器映射器中，处理映射器会根据URL地址决定请求的下一站在哪里
     *  4.进入控制器中，将处理后的视图和模型返回给前端控制器
     *  5.前端控制器带着返回的信息，进入视图解析器中
     *  6.最后进入视图将结果返回到视图中
     */

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
