package com.imust.Controller;

import com.imust.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: wangJianBo
 * Date: 2020/1/30 17:18
 * Content:
 */
@Controller
@RequestMapping("/Param")
public class ParamController {

    /**
     * 请求参数的绑定：
     *
     * 1.参数类型的绑定，要求提交的参数必须和方法中的参数名称一致
     * 2.javaBean类型的参数绑定,名字必须要与JavaBean中的名字相同
     * 3.集合类型的参数绑定
     *      list：<input type="text" name="listUser[0].uname"><br>
     *      Map ：<input type="text" name="mapUser['one'].uname"><br>
     */

    @RequestMapping("/testParam1")
    public String testParam1(String name, String passworld){
        System.out.println(name);
        System.out.println(passworld);
        return "success";
    }

    @RequestMapping("/testParam2")
    public String testParam2(Account account){
        System.out.println(account);
        return "success";
    }

}
