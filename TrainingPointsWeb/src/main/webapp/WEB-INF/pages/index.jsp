<%-- 
    Document   : index
    Created on : May 19, 2024, 2:20:11 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Hello World!</h1>
        <div>${activities}</div>
        <c:forEach items="${activities}" var="c">
            <div>${c.name}</div>
        </c:forEach>
    </body>
</html>
