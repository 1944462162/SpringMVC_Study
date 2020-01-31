package com.imust.Controller;

import com.imust.domain.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Author: wangJianBo
 * Date: 2020/1/31 10:11
 * Content:
 */
@Controller
@RequestMapping("/User")
public class UserController {

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

//        重定向
//        response.sendRedirect(request.getContextPath()+"/success.jsp");

//        直接响应
        response.setCharacterEncoding("UTF-8");
        response.setContentType("test/html;charset=UTF-8");

        response.getWriter().print("你好");
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setUname("小花");
        user.setAge(18);
        modelAndView.addObject("msg",user);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /**
     * 文件上传的步骤：
     *
     * 1.获取文件上传的路径
     * 2.通过前端控制器，找到文件解析器（配置文件解析器）
     * 3.通过MultipartFile实现文件上传
     * @param request
     * @param upload
     * @return
     * @throws Exception
     */

    @RequestMapping("/fileUpload")
    public String fileUpload(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("文件上传");

        //获取文件上传的路径
        String path = request.getSession().getServletContext().getRealPath("/uploads/");

        File file = new File(path);
//        如果路径不存在创建文件
        if (!file.exists()){
            file.mkdirs();
        }

        //获取上传文件的名字
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        //完成上传
        upload.transferTo(new File(path,filename));

        return "success";
    }
}
