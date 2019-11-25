<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; chatset=UTF-8">
    <title>Create Location</title>
</head>
<body>
<pre>
<form action ="updateLoc" method="post">
    Id: <input type="text" name="Id" value="${location.id}" readonly/>
    Code: <input type="text" name="code" value="${location.code}"/>
    Name: <input type="text" name="name" value="${location.name}"/>
    Type: Urban <input type="radio" name="type" value="Urban" ${location.type=='Urban'?'checked': ''}/>
          Rural <input type="radio" name="type" value="Rural" ${location.type=='Rural'?'checked': ''}/>
    <input type="Submit" value="Save"/>
</form>
</pre>
</body>
</html>
