<%@ page import="cn.simple.web.model.User" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<a href="addUser.do">新增用户</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    <%
        Object object = request.getAttribute("userList");
        if (null != object) {
            List<User> userList = (List<User>) object;
            for (User user : userList) {

    %>
    <tr>
        <td><%=user.getId()%>
        </td>
        <td><%=user.getUsername()%>
        </td>
        <td><%=user.getPassword()%>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
