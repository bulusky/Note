<%--
  Created by IntelliJ IDEA.
  User: 寒江醉月
  Date: 2020/5/27
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <%--文件上传要求form表单的enctype属性的值必须是mutipart/form-data，
    默认值为application/x-www-form-urlencode。
    method的属性必须为post
    提供一个文件域<input type=“file”>--%>
</head>

<body>
<form action="fileLoad/one" enctype="multipart/form-data" method="post">
    文件上传：<input type="file" name="upLoad">
    <input type="submit" value="传统方式">
</form>
<br>
<form action="fileLoad/two" enctype="multipart/form-data" method="post">
    文件上传：<input type="file" name="upLoad">
    <input type="submit" value="mvc">
</form>
<br>
<form action="fileLoad/three" enctype="multipart/form-data" method="post">
    文件上传：<input type="file" name="upLoad">
    <input type="submit" value="跨服务器">
</form>

</body>
</html>
