<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()+"://"+
                        request.getServerName()+":"+request.getServerPort()
                        +request.getContextPath()+"/";
%>
<html>
<head>
    <title>注册</title>
    <base href="<%=basePath%>">
</head>
<body>
<div align="center">
    <form action="addStudent.do" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>
