<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/12/9
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Book</title>
</head>
<body>
<c:form action="${pageContext.request.contextPath}/toUp">
    <input type="text" name="bookName">
    <input type="submit" value="搜索">
</c:form>
<a href="${pageContext.request.contextPath}/tj">添加</a>
<table class="table table-bordered table-striped" border="1">
    <tr>
        <th>用户编号</th>
        <th>用户姓名</th>
        <th>操作</th>
    </tr>

    <f:forEach items="${list}" var="list">
<tr>
    <td class="text-center">${list.bookId}</td>
    <td class="text-center">${list.bookName}</td>
    <td><a>刪除</a></td>
    <td><a>修改</a></td>
</tr>
</f:forEach>
</table>
</body>
</html>
