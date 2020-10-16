<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/getAll">查询所有</a>
<form action="user/saveOne" method="post">
    <label>
        姓名：
        <input type="text" name="name"/>
    </label>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>