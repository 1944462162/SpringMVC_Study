package com.imust.Controller;

import com.imust.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.nio.channels.FileChannel;
import java.util.Map;

/**
 * Author: wangJianBo
 * Date: 2020/1/30 19:31
 * Content:
 */

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})
public class AnnounceController {

    /**
     * RequestParam注解的作用：指定参数的名称
     * @param name
     * @return
     */
    @RequestMapping("/testAnnoParam")
    public String testAnnoParam(@RequestParam("uname") String name){
        System.out.println(name);
        return "success";
    }

    /**
     * RequestBody注解的作用：
     *      获取请求体，要求请求的表单是post类型
     * @param body
     * @return
     */
    @RequestMapping("/testAnnoRequestBody")
    public String testAnnoRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable方法的作用获取请求路径中的值
     * @param id
     * @return
     */
    @RequestMapping("/testAnnoPathVariable/{index}")
    public String testAnnoPathVariable(@PathVariable("index") String id){
        System.out.println(id);
        return "success";
    }

    /**
     * ModelAttribute作用：在调用的方法之前执行，常用于添加数据库中的默认值
     * @param user
     * @return
     */
    @RequestMapping("/testAnnoModelAttribute")
    public String testAnnoModelAttribute(@ModelAttribute("aaa") User user){
        System.out.println(user);
        return "success";
    }

//    @ModelAttribute
//    public User showUser(String name){
//        //模拟从数据库中查询
//        User user = new User();
//        user.setUname(name);
//        user.setAge(20);
//        return user;
//    }

    @ModelAttribute
    public void showUser(String name,Map<String,User> map){
        User user = new User();
        user.setUname(name);
        user.setAge(20);
        map.put("aaa",user);
    }


    /**
     * 将数据存入session域对象中：
     *    作用实现数据共享
     * @param mode
     * @return
     */
    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model mode){
        mode.addAttribute("msg","美美");
        return "success";
    }

    /**
     * 获取Session对象
     * @param modelMap
     * @return
     */
    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap){
        Object msg = modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 清除Session中的对象
     * @param status
     * @return
     */
    @RequestMapping("/delSessionStatus")
    public String delSessionStatus(SessionStatus status){
        status.setComplete();
        return "success";
    }
}
