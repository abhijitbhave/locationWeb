<%--
  Created by IntelliJ IDEA.
  User: abhave
  Date: 2019-11-17
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Locations</h2>
<table>
    <tr>
        <th>id</th>
        <th>code</th>
        <th>name</th>
        <th>type</th>
    </tr>
    <c:forEach items = "${locations}" var="location">
        <tr>
            <td>${location.id}</td>
            <td>${location.code}</td>
            <td>${location.name}</td>
            <td>${location.type}</td>
            <td><a href="deleteLocation?id=${location.id}">Delete</a> </td>
            <td><a href="editLocation?id=${location.id}">Edit</a> </td>
        </tr>
    </c:forEach>
</table>
${msg}
<br></br>
<a href="showCreate">Add Location</a>
</body>
</html>
