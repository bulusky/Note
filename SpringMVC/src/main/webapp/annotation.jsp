<%--
  Created by IntelliJ IDEA.
  User: 寒江醉月
  Date: 2020/5/27
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解</title>
</head>
<body>
<a href="annotation/one?username=haha&password=123">RequestParams</a><br>
<h3>RequestBody</h3>
<form action="annotation/two" method="post">
    用户名：<input type="text" name="username"/>
</form>
<br>
<a href="annotation/three/{id}">@PathVariable</a><br>
<a href="annotation/four">requestful</a><br>
<a href="annotation/five">@RequestHeader</a><br>
<a href="annotation/six">@cookieValue</a><br>
<h3>@ModelAttribute</h3>
<form action="annotation/eight" method="post">
    用户名：<input type="text" name="username"/>
    时间：<input type="text" name="date"/>
    <input type="submit" value="提交">
</form>
<br>
<a href="annotation/nine">@SessionAttributes</a><br>
<a href="annotation/ten">@SessionAttributes</a><br>
<a href="annotation/eleven">@SessionAttributes</a><br>


</body>
</html>
