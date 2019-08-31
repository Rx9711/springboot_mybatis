<%@ page import="com.lqx.sandm.pojo.User" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: dell-1
  Date: 2019/8/31
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据页面</title>
</head>
<body>
这是我的JSP页面!
<br>
<%
    List<User> userList = (List<User>) request.getAttribute("userList");
    for(int i = 0; i < userList.size(); i++){
        User user = userList.get(i);
        out.print(user);
        out.print("<br>");
    }
%>
</body>
</html>
