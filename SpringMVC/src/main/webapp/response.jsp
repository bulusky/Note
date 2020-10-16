<%--
  Created by IntelliJ IDEA.
  User: 寒江醉月
  Date: 2020/5/27
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<script src="js/jquery-1.11.0.min.js"/>
<script src="js/jquery-3.3.1.js"/>
<head>
    <title>响应参数</title>
</head>
<body>
<a href="response/one">String</a><br>
<a href="response/two">Void</a><br>
<a href="response/three">ModelAndView</a><br>
<a href="response/four">forward、redirect</a><br>
<input id="btn" type="button" value="异步json数据"><br>
<script>
    $(function () {
        $("#btn").click(function () {
            //发生ajax请求
            $.ajax({
                //编写json格式
                rul: "response/five",//路径
                contextType: "application/json;charset=utf-8",//编码格式
                data: '{"username":"hehe","password":"123"}',//传过去的数据
                dataType: "json",//返回的格式
                type: "post",//发送的方式
                success: function (data) {
                    alert(data.username);

                }//返回的数据

            });
        });
    });
</script>
</body>
</html>
