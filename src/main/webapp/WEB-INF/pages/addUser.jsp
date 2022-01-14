<%@ page import="cn.simple.web.model.User" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<a href="list.do">跳转用户列表</a>
<h3> value="<%=request.getAttribute("status")%>"</h3>
<form action="addUser.do" method="post">
    用户名: <input name="username" value="<%=request.getAttribute("username")%>"/><br/>
    密码: <input name="password" value="<%=request.getAttribute("password")%>"/><br/>
    <button type="submit">提交</button>
</form>
</body>
</html>
