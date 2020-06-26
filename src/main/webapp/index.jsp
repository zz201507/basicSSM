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
    <p>SSM整合</p>
    <table>
        <tr>
            <td><a href="addStudent.jsp">学生注册</a></td>
        </tr>
        <tr>
            <td>浏览学生</td>
        </tr>
    </table>
    <img src="images/星球.jpg" />
</div>
</body>
</html>
