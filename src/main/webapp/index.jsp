<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/1/30
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2>入门程序</h2>
    <a href="hello?username=hehe">hello</a>


    <h2>请求参数的绑定</h2>

    <a href="Param/testParam1?name=hehe&passworld=123">请求参数的绑定</a>

    <form action="Param/testParam2">
        姓名：<input type="text" name="name"><br>
        密码：<input type="text" name="password"><br>
        金额：<input type="text" name="money"><br>
        用户姓名：<input type="text" name="user.uname"><br>
        用户年龄：<input type="text" name="user.age"><br>

        集合类型的姓名：<input type="text" name="listUser[0].uname"><br>
        集合类型的年龄：<input type="text" name="listUser[0].age"><br>

        Map类型的用户姓名：<input type="text" name="mapUser['one'].uname"><br>
        Map类型的用户年龄：<input type="text" name="mapUser['one'].age"><br>

        用户生日:<input type="text" name="birthday">
        <input type="submit" value="提交">
    </form>

    <h2>常用注解</h2>

    <a href="anno/testAnnoParam?uname=哈哈">RequestParam注解</a><br>

    <form action="anno/testAnnoRequestBody" method="post">
        用户名：<input type="text" name="name"><br>
        密码： <input type="text" name="password"><br>
        <input type="submit" value="提交">
    </form><br>

    <a href="anno/testAnnoPathVariable/10">PathVariable注解</a><br>

    <form action="anno/testAnnoModelAttribute" method="post">
        用户名：<input type="text" name="name"><br>
        <input type="submit" value="提交">
    </form><br>

    <a href="anno/testSessionAttribute">testSessionAttribute</a><br>
    <a href="anno/getSessionAttribute">getSessionAttribute</a><br>
    <a href="anno/delSessionStatus">delSessionStatus</a><br>

    <h2>反应值是Void类型的</h2>

    <a href="User/testVoid">testVoid</a>

    <h2>反应值是ModelAndView类型的</h2>

    <a href="User/testModelAndView">testModelAndView</a>

    <h2>文件上传</h2>

    <form action="User/fileUpload" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload">
        <input type="submit" value="上传">
    </form>

    <h2>异常处理</h2>

    <a href="User/testEcxeption">testEcxeption</a>
</body>
</html>
