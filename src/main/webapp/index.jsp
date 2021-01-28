<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
            request.getServerName()+":"+request.getServerPort()
            +request.getContextPath()+"/";
%>
<html>
<head>
    <title>首页</title>
    <base href="<%=basePath%>">
</head>
<body>
<div align="center">
    <p>SSM TEST</p>
    <table>
        <tr>
            <td><a href="addStudent.jsp">注册</a></td>
        </tr>
        <tr>
            <td> <a href="login.jsp">登录</a> </td>
        </tr>
        <tr>
            <td><a href="selectStudents.do" >查看所有的用户信息</a></td>
        </tr>
    </table>
    <img src="images/星球.jpg" />
</div>
</body>
</html>
