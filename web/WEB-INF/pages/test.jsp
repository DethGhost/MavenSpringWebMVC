<%--
  Created by IntelliJ IDEA.
  User: DethGhost
  Date: 08.10.2016
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Fire!</h1>
<p>
    <h2>${requestScope.name} Going to home</h2>
<br /> <h2>Has email: ${requestScope.email} </h2>
</p>
<form method="get" action="Surname">
    <input type="text" name="surname" placeholder="Enter Surname"/>
    <button>Submit</button>
</form>
</body>
</html>
