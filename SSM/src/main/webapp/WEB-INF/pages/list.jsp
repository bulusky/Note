
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有的账户信息</h3>
<c:forEach items="${list}" var="user">
    ${user.name}
</c:forEach>
</body>
</html>
