<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/30
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    首页6
<ul>
    <li>
        <%--<img src="${pageContext.request.contextPath}/static/images/a.jpg">--%>
    </li>
    <li>
        <%--<img src="${pageContext.request.contextPath}/static/img/b.jpg">--%>
    </li>
</ul>
<div>
    <c:form modelAttribute="book" action="${pageContext.request.contextPath}/book/login" method="post">
        书名:<f:input path="bookName"/><br>
        <input type="submit" value="确定">
    </c:form>


</div>
    <hr/>
<%=System.currentTimeMillis()%>
<div>
    <a href="${pageContext.request.contextPath}/book/zh">zh</a>
    <a href="${pageContext.request.contextPath}/book/en">en</a>
</div>
<div>
    <p>
        <t:message code="yhzh.label"></t:message>
    </p>
    <p>
        <t:message code="yhmm.label"></t:message>
    </p>
    <%--<p>--%>
        <%--{msg}--%>
    <%--</p>--%>
</div>
<div>
    <c:form action="${pageContext.request.contextPath}/book/getFile" method="post" enctype="multipart/form-data">
        <input type="file" name="fileup"  />
        <input type="submit" value="上传" />
    </c:form>
</div>
</body>
</html>
