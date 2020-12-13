<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/12/9
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>添加</title>
</head>
<c:form action="${pageContext.request.contextPath}/tjBook">
    <input type="text" name="bookName">
    <input type="submit" value="添加">
</c:form>
<body>
</body>
</html>