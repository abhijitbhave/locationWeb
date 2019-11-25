<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; chatset=UTF-8">
    <title>Create Location</title>
</head>
<body>
<pre>
<form action ="saveLoc" method="post">
    Id: <input type="text" name="Id"/>
    Code: <input type="text" name="code"/>
    Name: <input type="text" name="name"/>
    Type: Urban <input type="radio" name="type" value="Urban"/>
          Rural <input type="radio" name="type" value="Rural"/>
    <input type="Submit" value="Save"/>
</pre>
</form>
${msg}
<a href="displayLocations">View All Locations</a>


</body>
</html>
